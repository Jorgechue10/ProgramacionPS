package P01_Creacion;

public class EJ_0_Hilo_thread extends Thread {

	public void run() {
		for(int i=0; i<5; i++)
			System.out.println("Soy el hilo, me estoy ejecutando");
	}
	
	public static void main(String[] args) {
		EJ_0_Hilo_thread h0 = new EJ_0_Hilo_thread();
		h0.start();
		System.out.println("Soy la clase que lanza el hilo...");
	}
}