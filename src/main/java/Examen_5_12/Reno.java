package Examen_5_12;

public class Reno extends Empleados{
	private double velocidad;
	
	public Reno(String nombre, String pais, double velocidad) {
		super(nombre, pais);
		this.velocidad = velocidad;
	}

	public double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nVelocidad a la que puede tirar del trineo: " + velocidad + "km/s";
	}
}
