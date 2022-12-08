package Examen2.Programacion;

import java.time.LocalDate;

public class Cuenta {
	protected String nombre;
	protected String apodo;
	protected boolean titular = false;
	protected String iban;
	protected LocalDate fecAlta;
	
	
	public Cuenta (String nombre, String apodo, boolean titular, String iban, LocalDate fecAlta) {
		this.nombre = nombre;
		this.apodo = apodo;
		this.titular = titular;
		this.iban = iban;
		this.fecAlta = LocalDate.now();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	
	public boolean getTitular() {
		return titular;
	}
	public void setTitular(boolean titular) {
		this.titular = titular;
	}
	
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	
	public LocalDate getFecAlta() {
		return fecAlta;
	}
	public void setFecAlta(LocalDate fecAlta) {
		this.fecAlta = fecAlta;
	}
	
	
	@Override
	public String toString() {
		return "Usuario de la cuenta: " + nombre + "\naApodo: " + apodo + "\nTitular: " + titular + "\nNúmero de cuenta: " + iban + "\nFecha de alta: " + fecAlta;
	}
}
