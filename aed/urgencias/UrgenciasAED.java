package aed.urgencias;

import es.upm.aedlib.Entry;
import es.upm.aedlib.map.HashTableMap;
import es.upm.aedlib.map.Map;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.positionlist.PositionList;
import es.upm.aedlib.priorityqueue.HeapPriorityQueue;
import es.upm.aedlib.priorityqueue.PriorityQueue;
import es.upm.aedlib.priorityqueue.SortedListPriorityQueue;

public class UrgenciasAED implements Urgencias{

	private PriorityQueue<Paciente,Paciente> cola;
	private Map<String,Entry<Paciente,Paciente>> entries;
	
	public UrgenciasAED() {
		this.cola = new HeapPriorityQueue<Paciente,Paciente>(new PrioridadComparator());
		this.entries = new HashTableMap<String,Entry<Paciente,Paciente>>();
	}

	@Override
	public void admitirPaciente(String DNI, int prioridad) {
		Paciente p = new Paciente(DNI,prioridad);
		entries.put(p.getDNI(), cola.enqueue(p, null));
		
	}

	@Override
	public void salirPaciente(String DNI) throws NoHayPacienteExc {
		if(! entries.containsKey(DNI))
			throw new NoHayPacienteExc();
		cola.remove(entries.remove(DNI));
		
	}

	@Override
	public void cambiarPrioridad(String DNI, int nuevaPrioridad) throws NoHayPacienteExc {
		if(! entries.containsKey(DNI))
			throw new NoHayPacienteExc();
		Entry<Paciente,Paciente> entry = entries.get(DNI);
		Paciente p = entry.getKey();
		if (p.getPrioridad() != nuevaPrioridad) {
			p.setPrioridad(nuevaPrioridad);
			p.setHoraLlegadaPrioridad(Time.currentTimeMillis());
			cola.replaceKey(entry, entry.getKey());
		}
	}

	@Override
	public Paciente getProximoPaciente() throws NoHayPacienteExc {
		if(cola.isEmpty())
			throw new NoHayPacienteExc();
		return cola.first().getKey();
	}

	@Override
	public Paciente atenderPaciente() throws NoHayPacienteExc {
		if(cola.isEmpty())
			throw new NoHayPacienteExc();
		entries.remove(getProximoPaciente().getDNI());
		return cola.dequeue().getKey();
	}

	@Override
	public void aumentaPrioridad(long maxTiempoEspera) {
		for(String dni : entries.keys()) {
			Paciente p = entries.get(dni).getKey();
			if(Time.currentTimeMillis()-p.getHoraLlegadaPrioridad()>maxTiempoEspera && p.getPrioridad()>0)
				p.setPrioridad(p.getPrioridad()-1);
		}
		
	}

	@Override
	public Iterable<Paciente> getPacientesPorOrdenDeLlegada() {
		PriorityQueue<Paciente, Void> pq = new SortedListPriorityQueue<Paciente, Void>
				(new LlegadaUrgenciasComparator());
		PositionList<Paciente> list = new NodePositionList<Paciente>();
		for(Entry<Paciente, Paciente> entry : cola) {
			pq.enqueue(entry.getKey(), null);
		}
		for(Entry<Paciente, Void> entry : pq) {
			list.addLast(entry.getKey());
		}
		return list;
	}

}

