package P01_Creacion;

public class EJ_1_Hilo_thread extends Thread{
	
	private int x;

	EJ_1_Hilo_thread(int x) {
		this.x = x;
	}

	public void run() {
		for (int i = 0; i < x; i++)
			System.out.println("En el Hilo... " + i);
	}

	public static void main(String[] args) {
		EJ_1_Hilo_thread p = new EJ_1_Hilo_thread(5);
		p.start();
	}// main
}