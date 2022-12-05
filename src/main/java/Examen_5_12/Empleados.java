package Examen_5_12;

public class Empleados {
	protected String nombre;
	protected String pais;
	
	public Empleados(String nombre, String pais) {
		this.nombre = nombre;
		this.pais = pais;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nombre: " + nombre + "\nOriginario de: " + pais;
	}
}
