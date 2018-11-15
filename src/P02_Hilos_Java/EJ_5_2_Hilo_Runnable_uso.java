package P02_Hilos_Java;

public class EJ_5_2_Hilo_Runnable_uso {

	public static void main(String[] args) {
		EJ_5_1_Hilo_Runnable h4 = new EJ_5_1_Hilo_Runnable();
		Thread t = new Thread(h4);
		t.start();
		for(int i=0; i<5; i++)
			System.out.println("Soy la clase principal");

	}

}