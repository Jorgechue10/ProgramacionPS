package P02_Hilos_Java;

public class EJ_0_2_Hilo_thread_uso {

	public static void main(String[] args) {
		EJ_0_1_Hilo_thread h0 = new EJ_0_1_Hilo_thread();
		h0.start();
		System.out.println("Soy la clase que lanza el hilo...");
	}
}
