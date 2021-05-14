package aed.urgencias;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

	@Test
	public void test_1() throws NoHayPacienteExc {
		UrgenciasAED u = new UrgenciasAED();
		Paciente p1 = new Paciente("111", 5);
		Paciente p2 = new Paciente("222",5);
		String dni1 = p1.getDNI();
		u.admitirPaciente(dni1,p1.getPrioridad());
		u.admitirPaciente(p2.getDNI(), p2.getPrioridad());
		assertEquals(dni1, u.getProximoPaciente().getDNI());
	}

	@Test
	public void test_2() throws NoHayPacienteExc{
		UrgenciasAED u = new UrgenciasAED();
		Paciente p1 = new Paciente("111", 5);
		Paciente p2 = new Paciente("222",5);
		String dni1 = p1.getDNI();
		String dni2 = p2.getDNI();
		u.admitirPaciente(dni1,p1.getPrioridad());
		u.admitirPaciente(dni2, p2.getPrioridad());
		assertEquals(dni1, u.atenderPaciente().getDNI());
		assertEquals(dni2, u.getProximoPaciente().getDNI());
	}
	
	@Test
	public void test_3() throws NoHayPacienteExc{
		UrgenciasAED u = new UrgenciasAED();
		Paciente p1 = new Paciente("111", 5);
		Paciente p2 = new Paciente("222",1);
		String dni2 = p2.getDNI();
		u.admitirPaciente(p1.getDNI(),p1.getPrioridad());
		u.admitirPaciente(dni2, p2.getPrioridad());
		assertEquals(dni2, u.getProximoPaciente().getDNI());
	}
	@Test
	public void test_4() throws NoHayPacienteExc{
		UrgenciasAED u = new UrgenciasAED();
		Paciente p1 = new Paciente("111", 5);
		Paciente p2 = new Paciente("222",5);
		String dni1 = p1.getDNI();
		String dni2 = p2.getDNI();
		u.admitirPaciente(dni1,p1.getPrioridad());
		u.admitirPaciente(dni2, p2.getPrioridad());
		u.salirPaciente(dni1);
		assertEquals(dni2, u.getProximoPaciente().getDNI());
	}
	@Test
	public void test_5() throws NoHayPacienteExc{
		UrgenciasAED u = new UrgenciasAED();
		Paciente p1 = new Paciente("111", 5);
		Paciente p2 = new Paciente("222",5);
		String dni2 = p2.getDNI();
		u.admitirPaciente(p1.getDNI(),p1.getPrioridad());
		u.admitirPaciente(dni2, p2.getPrioridad());
		u.cambiarPrioridad(dni2, 1);
		assertEquals(dni2, u.getProximoPaciente().getDNI());
	}
}
