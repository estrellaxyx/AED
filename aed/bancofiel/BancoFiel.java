package aed.bancofiel;

import java.util.Comparator;
import es.upm.aedlib.indexedlist.IndexedList;
import es.upm.aedlib.indexedlist.ArrayIndexedList;

/**
 * Implements the code for the bank application. Implements the client and the
 * "gestor" interfaces.
 */
public class BancoFiel implements ClienteBanco, GestorBanco {

	// NOTAD. No se deberia cambiar esta declaracion.
	public IndexedList<Cuenta> cuentas;

	// NOTAD. No se deberia cambiar esta constructor.
	public BancoFiel() {
		this.cuentas = new ArrayIndexedList<Cuenta>();
	}

	// ----------------------------------------------------------------------
	// Anadir metodos aqui ...
	@Override
	public String crearCuenta(String dni, int saldoIncial) {
		Cuenta cuenta = new Cuenta(dni, saldoIncial);
		insertarCuenta(cuenta);
		return cuenta.getId();
	}

	/**
	 * Método auxiliar que añade las cuentas a la lista de forma ordenada haciendo
	 * una búsqueda binaria.
	 * 
	 * @param cuenta
	 */
	private void insertarCuenta(Cuenta cuenta) {
		int max = cuentas.size()-1, min = 0, medio;
		while (min <= max) {
			medio = (max + min)/2;
			//si es mayor (la id de la cuenta que la que ya está en la lista), miro en la derecha
			if (cuenta.getId().compareTo(cuentas.get(medio).getId()) > 0) {
				min = medio + 1;
			}
			//si es menor o igual, miro en la izquierda
			else
				max = medio -1;
		}
		//como cuando es menor o igual entra en el else, tengo que sumarle 1 al maximo
		cuentas.add(max + 1, cuenta);

	}

	/**
	 * Método auxiliar para buscar las cuentas mediante una búsqueda binaria. Si la
	 * encuentra, devuelve su posición en la lista, si no, devuelve -1
	 * 
	 * @param id
	 * @return
	 */
	private int buscarCuenta(String id) throws CuentaNoExisteExc{
		int max = cuentas.size()-1, min = 0, medio=0;
		String medioVal;
		boolean encontrado =false;
		while (!encontrado && min <= max) {
			medio = (max + min)/2;
			medioVal = cuentas.get(medio).getId();
			
			//si es igual, lo he encontrado
			if(id.compareTo(medioVal) == 0) {
				encontrado = true;
			}
			//si es mayor, miro en el intervalo de la derecha
			else if (id.compareTo(medioVal) > 0) {
				min = medio +1;
			}
			//si es menor, miro en el intervalo de la izquierda
			else
				max = medio - 1;
		}
		
		if(!encontrado)
			throw new CuentaNoExisteExc();
		return medio;
	}

	@Override
	public void borrarCuenta(String id) throws CuentaNoExisteExc, CuentaNoVaciaExc {
		int esta = buscarCuenta(id);
		
		Cuenta cuenta = cuentas.get(esta);
		if (cuenta.getSaldo() != 0)
			throw new CuentaNoVaciaExc();

		cuentas.removeElementAt(esta);
	}

	@Override
	public int ingresarDinero(String id, int cantidad) throws CuentaNoExisteExc {
		int esta = buscarCuenta(id);
		
		Cuenta cuenta = cuentas.get(esta);
		return cuenta.ingresar(cantidad);
	}

	@Override
	public int retirarDinero(String id, int cantidad) throws CuentaNoExisteExc, InsuficienteSaldoExc {
		int esta = buscarCuenta(id);
		
		Cuenta cuenta = cuentas.get(esta);
		if (cuenta.getSaldo() < cantidad)
			throw new InsuficienteSaldoExc();
		return cuenta.retirar(cantidad);
	}

	@Override
	public int consultarSaldo(String id) throws CuentaNoExisteExc {
		int esta = buscarCuenta(id);
		
		Cuenta cuenta = cuentas.get(esta);
		return cuenta.getSaldo();
	}

	@Override
	public void hacerTransferencia(String idFrom, String idTo, int cantidad)
			throws CuentaNoExisteExc, InsuficienteSaldoExc {
		int estaFrom = buscarCuenta(idFrom), estaTo = buscarCuenta(idTo);
		
		Cuenta cuenta = cuentas.get(estaFrom);
		if (cuenta.getSaldo() < cantidad)
			throw new InsuficienteSaldoExc();

		cuenta.retirar(cantidad);
		cuentas.get(estaTo).ingresar(cantidad);
	}

	@Override
	public IndexedList<String> getIdCuentas(String dni) {
		IndexedList<String> res = new ArrayIndexedList<String>();
		for (int i = 0; cuentas.size() > i; i++) {
			if (cuentas.get(i).getDNI().equals(dni))
				res.add(res.size(), cuentas.get(i).getId());
		}
		return res;
	}

	@Override
	public int getSaldoCuentas(String dni) {
		int res = 0;
		for (int i = 0; cuentas.size() > i; i++) {
			if (cuentas.get(i).getDNI().equals(dni))
				res += cuentas.get(i).getSaldo();
		}
		return res;
	}

	@Override
	public IndexedList<Cuenta> getCuentasOrdenadas(Comparator<Cuenta> cmp) {
		IndexedList<Cuenta> res = new ArrayIndexedList<Cuenta>();
		
		//Si la lista esta vacia devuelvo directamente la respuesta vacia 
		if (cuentas.isEmpty())
			return res;
		
		//En otro caso, creo una copia de la lista en la lista respuesta
		for (int i = 0; cuentas.size() > i; i++) {
			res.add(i, cuentas.get(i));
		}
		
		//Finalmente ordeno la lista respuesta
		for (int i = 0; res.size() - 1 > i; i++) {
			for (int j = i + 1; res.size() > j; j++) {
				if (cmp.compare(res.get(i), res.get(j)) > 0) {
					Cuenta aux = res.get(i);
					res.set(i, res.get(j));
					res.set(j, aux);
				}
			}
		}
		return res;
	}


	// ----------------------------------------------------------------------
	// NOTAD. No se deberia cambiar este metodo.
	public String toString() {
		return "banco";
	}

}
