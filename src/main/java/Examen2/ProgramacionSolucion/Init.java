package Examen2.ProgramacionSolucion;

import java.time.LocalDate;

public class Init {

	public static void main(String[] args) {
		
		GestorServicios gestor = new GestorServicios();

		Cuenta cuenta1Netflix = new Cuenta("Sergio", "Serj", true, "ES02 5674 5784 76 8465746354");
		Cuenta cuenta2Netflix = new Cuenta("Alicia", "Isia", false, "ES05 5748 2337 90 8465746354");

		Netflix net = new Netflix(cuenta1Netflix, 15.99, LocalDate.now(), "España");
		net.setCuenta2(cuenta2Netflix);
		
		gestor.setNetflix(net);
		
		
		Cuenta cuenta1Hbo = new Cuenta("Sergio", "Serj", true, "ES00 0000 0000 00 1234567890");
		HBOMax hbo = new HBOMax(cuenta1Hbo, 8.99, LocalDate.now(), true);
		gestor.setHbo(hbo);
		
		System.out.println(gestor.toString());
		gestor.mostrarInformacionServicios();
		
		System.out.println("\n\nCOSTE DE SERVICIOS POR PERSONA");
		System.out.println("Netflix: " + gestor.getNetflix().costeServicioPersona());
	}
	
}
