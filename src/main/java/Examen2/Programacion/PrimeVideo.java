package Examen2.Programacion;

import java.time.LocalDate;

public class PrimeVideo extends Cuenta{
	private String email;
	private double precio = 3;
	
	public PrimeVideo (String nombre, String apodo, boolean titular, String iban, LocalDate fecAlta, String email, double precio) {
		super(nombre, apodo, titular, iban, fecAlta);
		this.email = email;
		this.precio = precio;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "\nEmail asociado de la cuenta Amazon Prime: " +  email + "\nSu precio es de: " +  precio;
	}
}
