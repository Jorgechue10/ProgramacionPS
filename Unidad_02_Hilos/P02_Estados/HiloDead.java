//Detener el hilo de forma segura usando una variable

package P02_Estados;

public class HiloDead extends Thread {
	  
	private boolean stopHilo = false; 
	
	public void pararHilo()  {
		stopHilo = true;
	}  
  
	public void run() {
		while (!stopHilo) {
			System.out.println("En el hilo...");
		}
	}
  
	public static void main(String[] args) {
		
		HiloDead h = new HiloDead ();		
		h.start();
		
		for(int i=0;i<100000; i++) ;//no hago nada		
		h.pararHilo();
	}
}