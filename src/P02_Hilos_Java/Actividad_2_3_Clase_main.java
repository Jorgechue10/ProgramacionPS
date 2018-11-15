package P02_Hilos_Java;

public class Actividad_2_3_Clase_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Actividad_2_1_Clase_Tic h1 = new Actividad_2_1_Clase_Tic();			
		h1.start();		
		Actividad_2_2_Clase_Tac h2 = new Actividad_2_2_Clase_Tac();			
		h2.start();		
	}
}