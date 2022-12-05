package Examen_5_12;

public class Elfo extends Empleados {
	protected int edad;
	public double sueldoDia;
	public double paquetesDia;
	
	public Elfo(String nombre, String pais, int edad, double sueldoDia, double paquetesDia) {
		super(nombre, pais);
		this.edad = edad;
		this.sueldoDia = sueldoDia;
		this.paquetesDia = paquetesDia;
	}

	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSueldoDia() {
		return sueldoDia;
	}
	public void setSueldoDia(double sueldoDia) {
		this.sueldoDia = sueldoDia;
	}

	public double getPaquetesDia() {
		return paquetesDia;
	}
	public void setPaquetesDia(double paquetesDia) {
		this.paquetesDia = paquetesDia;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nEdad: " + edad + "\nSueldo al día: " + sueldoDia + "€ \nEmpaqueta al día " + paquetesDia + " paquetes";
	}
}
