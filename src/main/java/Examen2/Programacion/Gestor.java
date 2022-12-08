package Examen2.Programacion;

import java.time.LocalDate;

public class Gestor {
	public static void mostrarInformacionServicios(String[] args) {
		String nombre = "Sergio";
		String apodo = "Serj";
		boolean titular = true;
		String iban = "ES00 0001 0002 00 0123456789";
		LocalDate fecAlta = LocalDate.now();
		String pais = "España";
		double precio = 15.99;
		
		if (titular = true) {
			System.out.print("Si");
		} else {
			System.out.print("No");
		}
		Cuenta c1 = new Netflix(nombre, apodo, titular, iban, fecAlta, pais, precio);
		System.out.println(c1);
		
		//Aqui iria otra cuenta de netflix, una de hbo y otra de prime video pero no me ha dado tiempo
	}
}
