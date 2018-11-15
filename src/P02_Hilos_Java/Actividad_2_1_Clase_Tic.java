package P02_Hilos_Java;

public class Actividad_2_1_Clase_Tic extends Thread {
	// constructor
	public Actividad_2_1_Clase_Tic() {}
		
	// método run
	public void run() {
		for(;;) {
			System.out.println("TIC");
			try {
			  Thread.sleep(1000);
			} catch (InterruptedException ex) {
			  // Stop immediately and go home
			}
		}			
	}

	
	/*public static void main(String[] args) {
		Actividad_2_1_Clase_Tic h1 = new Actividad_2_1_Clase_Tic();			
		h1.start();		
		Actividad_2_2_Clase_Tac h2 = new Actividad_2_2_Clase_Tac();			
		h2.start();		
		
	}*/
}