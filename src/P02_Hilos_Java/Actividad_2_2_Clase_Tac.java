package P02_Hilos_Java;

public class Actividad_2_2_Clase_Tac extends Thread{
	// constructor
	public Actividad_2_2_Clase_Tac() {}
		
	// método run
	public void run() {
		for(;;) {
			System.out.println("TAC");
			try {
			  Thread.sleep(1000);
			} catch (InterruptedException ex) {
			  // Stop immediately and go home
			}
		}			
	}
}
