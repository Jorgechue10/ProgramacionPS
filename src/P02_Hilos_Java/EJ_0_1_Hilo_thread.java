package P02_Hilos_Java;

public class EJ_0_1_Hilo_thread extends Thread {

	public void run() {
		for(int i=0; i<5; i++)
			System.out.println("Soy el hilo, me estoy ejecutando :-p");
	}
}