package Examen_5_12;


public class Init {
	public static void main(String[] args) {
		
		Elfo_Experto experto1 = new Elfo_Experto("Pit", "Rusia", 300, 90, 80, 1999);
		Elfo_Master master1 = new Elfo_Master("Rob", "Alemania", 533, 150, 190, 1);
		Elfo_Aprendiz aprendiz1 = new Elfo_Aprendiz("Jun", "Francia", 133, 60, 40, true, false);
		Reno reno1 = new Reno("Rudolph", "Austria", 300);
		
		Controlador c1 = new Controlador(reno1, experto1, master1);
		System.out.println(c1);
		System.out.println(aprendiz1);
		
	}
}
