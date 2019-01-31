package P01_Creacion;

public class Actividad_2_2_Clase_Tac extends Thread{
	// constructor
	public Actividad_2_2_Clase_Tac() {}
		
	// método run
	public void run() {
		for(;;) {
			try {
				  Thread.sleep(1000);
			} catch (InterruptedException ex) {			 
			}
			System.out.println("TAC");
			try {
			  Thread.sleep(1000);
			} catch (InterruptedException ex) {			 
			}
		}			
	}
}
