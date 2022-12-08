package Examen2.Programacion;

import java.time.LocalDate;

public class Netflix extends Cuenta {
	private String pais;
	private double precio = 15.99;
	private int numUsuarios = 1;
	
	public Netflix (String nombre, String apodo, boolean titular, String iban, LocalDate fecAlta, String pais, double precio) {
		super(nombre, apodo, titular, iban, fecAlta);
		this.pais = pais;
		this.precio = precio;
	
	}
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public int getNumUsuarios() {
		return numUsuarios;
	}
	public void setNumUsuarios(int numUsuarios) {
		this.numUsuarios = numUsuarios;
	}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
		if (numUsuarios == 2) {
			this.precio /= 2;
		} else if (numUsuarios == 3) {
			this.precio /= 3;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nEste servicio es válido para contenidos de " +  pais + "\nSu precio es de: " +  precio;
	}
}
