package P02_Hilos_Java;

public class Actividad_2_1_Clase_Tic extends Thread {
	// constructor
	public Actividad_2_1_Clase_Tic() {}
		
	// método run
	public void run() {
		for(;;) {
			System.out.println("TIC");
			try {
			  Thread.sleep(2000);
			} catch (InterruptedException ex) {			  
			}
		}			
	}
}