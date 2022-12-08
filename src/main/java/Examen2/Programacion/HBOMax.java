package Examen2.Programacion;

import java.time.LocalDate;

public class HBOMax extends Cuenta{
	private boolean nueva;
	private double precio = 8.99;
	
	public HBOMax (String nombre, String apodo, boolean titular, String iban, LocalDate fecAlta, boolean nueva, double precio) {
		super(nombre, apodo, titular, iban, fecAlta);
		this.nueva = nueva;
		this.precio = precio;
	}
	
	public boolean getNueva() {
		return nueva;
	}
	public void setNueva(boolean nueva) {
		this.nueva = nueva;
	}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "\nCuenta heredada de HBO: " + nueva + "\nSu precio es de: " + precio;
	}
}
