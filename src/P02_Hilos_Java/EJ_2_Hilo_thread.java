package P02_Hilos_Java;

public class EJ_2_Hilo_thread extends Thread {
	
	// constructor
	public EJ_2_Hilo_thread(String nombre) {
		super(nombre);
		System.out.println("CREANDO HILO:" + getName());
	}

	// método run
	public void run() {
		for (int i=0; i<5; i++) 
			System.out.println("Hilo:" + getName() + " C = " + i);
	}

	//
	public static void main(String[] args) {
		EJ_2_Hilo_thread h1 = new EJ_2_Hilo_thread("Hilo 1");
		EJ_2_Hilo_thread h2 = new EJ_2_Hilo_thread("Hilo 2");
		EJ_2_Hilo_thread h3 = new EJ_2_Hilo_thread("Hilo 3");
			
		h1.start();
		h2.start();
		h3.start();
		
		System.out.println("3 HILOS INICIADOS...");
	}// main
	

}