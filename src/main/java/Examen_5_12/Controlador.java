package Examen_5_12;

public class Controlador {
	private Reno reno1;
	private Reno reno2;
	private Reno reno3;
	private Elfo_Experto experto1;
	private Elfo_Experto experto2;
	private Elfo_Experto experto3;
	private Elfo_Aprendiz aprendiz1;
	private Elfo_Aprendiz aprendiz2;
	private Elfo_Master master1;
	private Elfo_Master master2;
	private Elfo paquetesDia;
	private int semana;
	private int dia;
	
	public Controlador(Reno reno1, Elfo_Experto experto1, Elfo_Master master1) {
		this.reno1 = reno1;
		this.experto1 = experto1;
		this.master1 = master1;
	}
	
	public void actualizaCapacidadEmpaquetado(Elfo paquetesDia) {
		for (int i = 2; i <= semana; i++) {
				//Elfo experto
				double elfexp1 = getExperto1().getPaquetesDia() * 0.95; /*Multiplico por 0.95 porque es lo mismo que restarle el 5%*/
				getExperto1().setPaquetesDia(elfexp1);
				
				if (experto2 != null) {
					double elfexp2 = getExperto2().getPaquetesDia() * 0.95;
					getExperto2().setPaquetesDia(elfexp2);
				}
				if (experto3 != null) {
					double elfexp3 = getExperto3().getPaquetesDia() * 0.95;
					getExperto3().setPaquetesDia(elfexp3);
				}
				
				//Elfo master
				
				double elfmas1 = getMaster1().getPaquetesDia() * 0.97;	/*Multiplico por 0.97 porque es lo mismo que restarle el 3%*/
				getMaster1().setPaquetesDia(elfmas1);
				
				if (master2 != null) {
					double elfmas2 = getMaster2().getPaquetesDia() * 0.97;
					getMaster2().setPaquetesDia(elfmas2);
				}
				
				//Elfo aprendiz
				if (aprendiz1 != null) {
					double elfap1 = getAprendiz1().getPaquetesDia() * 0.93;	/*Multiplico por 0.93 porque es lo mismo que restarle el 7%*/
					getAprendiz1().setPaquetesDia(elfap1);
				}
				
				if (aprendiz2 != null) {
					double elfap2 = getAprendiz2().getPaquetesDia() * 0.93;
					getAprendiz2().setPaquetesDia(elfap2);
			}
		}
	}
	
	public Elfo mostarCapacidadEmpaquetadoActual() {
		return paquetesDia;
	}
	
	public double costeEmpresa() {
		double costeDia = (getExperto1().getSueldoDia() + getMaster1().getSueldoDia());
		if (experto2 != null) {
			costeDia += getExperto2().getSueldoDia();
		}
		if (experto3 != null) {
			costeDia += getExperto3().getSueldoDia();
		}
		if (master2 != null) {
			costeDia += getMaster2().getSueldoDia();
		}
		if (aprendiz1 != null) {
			costeDia += getAprendiz1().getSueldoDia();
		}
		if (aprendiz2 != null) {
			costeDia += getAprendiz2().getSueldoDia();
		}
		double costeEmpresa = dia * costeDia;
		return costeEmpresa;
	}

	public Reno getReno1() {
		return reno1;
	}
	public void setReno1(Reno reno1) {
		this.reno1 = reno1;
	}
	
	public Reno getReno2() {
		return reno2;
	}
	public void setReno2 (Reno reno2) {
		this.reno2 = reno2;
	}
	
	public Reno getReno3() {
		return reno3;
	}
	public void setReno3 (Reno reno3) {
		this.reno3 = reno3;
	}

	public Elfo_Experto getExperto1() {
		return experto1;
	}
	public void setExperto1(Elfo_Experto experto1) {
		this.experto1 = experto1;
	}

	public Elfo_Experto getExperto2() {
		return experto2;
	}
	public void setExperto2(Elfo_Experto experto2) {
		this.experto2 = experto2;
	}

	public Elfo_Experto getExperto3() {
		return experto3;
	}
	public void setExperto3(Elfo_Experto experto3) {
		this.experto3 = experto3;
	}

	public Elfo_Aprendiz getAprendiz1() {
		return aprendiz1;
	}
	public void setAprendiz1(Elfo_Aprendiz aprendiz1) {
		this.aprendiz1 = aprendiz1;
	}

	public Elfo_Aprendiz getAprendiz2() {
		return aprendiz2;
	}
	public void setAprendiz2(Elfo_Aprendiz aprendiz2) {
		this.aprendiz2 = aprendiz2;
	}

	public Elfo_Master getMaster1() {
		return master1;
	}
	public void setMaster1(Elfo_Master master1) {
		this.master1 = master1;
	}

	public Elfo_Master getMaster2() {
		return master2;
	}
	public void setMaster2(Elfo_Master master2) {
		this.master2 = master2;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String trabajadores = "Trabajadores de Santa: \n\nElfo experto: " + experto1
				+ "\n\nElfo master: " + master1 + "\n\nReno: " + reno1;
		if (experto2 != null) {
			trabajadores += "\nElfo experto: " + experto2;
		}
		if (experto3 != null) {
			trabajadores += "\nElfo experto: " + experto3;
		}
		if (master2 != null) {
			trabajadores += "\nElfo master: " + master2;
		}
		if (aprendiz1 != null) {
			trabajadores += "Elfo aprendiz: " + aprendiz1;
		}
		if (aprendiz2 != null) {
			trabajadores += "\nElfo aprendiz: " + aprendiz2;
		}
		if (reno2 != null) {
			trabajadores += "\nReno: " + reno2;
		}
		if (reno3 != null) {
			trabajadores += "\nReno: " + reno3;
		}
		return trabajadores;
	}
}