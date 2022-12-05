package Examen_5_12;

public class Elfo_Experto extends Elfo{
	private int añoExperto;
	
	public Elfo_Experto(String nombre, String pais, int edad, double sueldoDia, double paquetesDia, int añoExperto) {
		super(nombre, pais, edad, sueldoDia, paquetesDia);
		this.añoExperto = añoExperto;
	}

	public int getAñoExperto() {
		return añoExperto;
	}
	public void setAñoExperto(int añoExperto) {
		this.añoExperto = añoExperto;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nAño en el que se hizo experto: " + añoExperto;
	}
}
