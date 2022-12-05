package Examen_5_12;

public class Elfo_Master extends Elfo{
	private int elfosCargo;
	
	public Elfo_Master (String nombre, String pais, int edad, double sueldoDia, double paquetesDia, int elfosCargo) {
		super(nombre, pais, edad, sueldoDia, paquetesDia);
		this.elfosCargo = elfosCargo;
	}

	public int getElfosCargo() {
		return elfosCargo;
	}
	public void setElfosCargo(int elfosCargo) {
		this.elfosCargo = elfosCargo;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nNumero de elfos a su cargo: " + elfosCargo;
	}
}
