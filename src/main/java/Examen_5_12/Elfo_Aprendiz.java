package Examen_5_12;

public class Elfo_Aprendiz extends Elfo{
	private boolean comidaRenos;
	private boolean ponche;
	
	public Elfo_Aprendiz(String nombre, String pais, int edad, double sueldoDia, double paquetesDia, boolean comidaRenos, boolean ponche) {
		super(nombre, pais, edad, sueldoDia, paquetesDia);
		this.comidaRenos = comidaRenos;
		this.ponche = ponche;
	}

	public boolean isComidaRenos() {
		return comidaRenos;
	}
	public void setComidaRenos(boolean comidaRenos) {
		this.comidaRenos = comidaRenos;
	}

	public boolean isPonche() {
		return ponche;
	}
	public void setPonche(boolean ponche) {
		this.ponche = ponche;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String info = "\nTiene las siguientes hablilidades: ";
		if (this.comidaRenos = true) {
			info += "\nSabe dar de comer a los renos";
		} else if (this.comidaRenos = false) {
			info += "\nNo sabe dar de comer a los renos";
		}
		if (this.ponche = true) {
			info += "\nSabe hacer ponche";
		} else if (this.ponche = false) {
			info += "\nNo sabe hacer ponche";
		}
		return info;
	}
}
