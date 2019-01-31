package P01_Creacion;

public class EJ_5_Hilo_Runnable implements Runnable {
	
	/* Al utilizar la interfaz Runnable, se implementa obligatoriamente
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		for(int i=0; i<5; i++)
			System.out.println("Soy el hilo, me estoy ejecutando");
	}
	
	public static void main(String[] args) {
		EJ_5_Hilo_Runnable h4 = new EJ_5_Hilo_Runnable();
		Thread t = new Thread(h4);
		t.start();
		for(int i=0; i<5; i++)
			System.out.println("Soy la clase principal");

	}
}