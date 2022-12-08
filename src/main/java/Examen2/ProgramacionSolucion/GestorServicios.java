package Examen2.ProgramacionSolucion;

public class GestorServicios {

	private Netflix netflix;
	private HBOMax hbo;
	private PrimeVideo prime;

	public void mostrarInformacionServicios(){
		System.out.println("INFORMACION GENERAL DE LOS SERVICIOS CONTRATADOS");

		if (this.netflix != null) {
			System.out.println(this.netflix);
		}
		if (this.hbo != null) {
			System.out.println(this.hbo);
		}
		if (this.prime != null) {
			System.out.println(this.prime);
		}
	}

	public Netflix getNetflix() {
		return netflix;
	}

	public void setNetflix(Netflix netflix) {
		this.netflix = netflix;
	}

	public HBOMax getHbo() {
		return hbo;
	}

	public void setHbo(HBOMax hbo) {
		this.hbo = hbo;
	}

	public PrimeVideo getPrime() {
		return prime;
	}

	public void setPrime(PrimeVideo prime) {
		this.prime = prime;
	}

	@Override
	public String toString() {
		String serviciosDisponibles = "SERVICIOS DISPONIBLES EN SU SMART TV\n";

		if (this.netflix != null) {
			serviciosDisponibles = serviciosDisponibles + "Netflix\n";
		}
		if (this.hbo != null) {
			serviciosDisponibles = serviciosDisponibles + "HBO Max\n";
		}
		if (this.prime != null) {
			serviciosDisponibles = serviciosDisponibles + "\nPrime Video";
		}
		return serviciosDisponibles;
	}
}
