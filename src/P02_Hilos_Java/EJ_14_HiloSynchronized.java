package P02_Hilos_Java;

class Contador2 {
	private int c = 0;

	Contador2(int c) {
		this.c = c;
	}

	public void incrementa() {
		c = c + 1;
	}

	public void decrementa() {
		c = c - 1;
	}

	public int getValor() {
		return c;
	}

}

class HiloA2 extends Thread {
	private Contador2 contador;

	public HiloA2(String n, Contador2 c) {
		setName(n);
		contador = c;
	}

	public void run() {
		// el objeto compartido es contador
		/*el synchronized lo que hace es bloquear, hasta que no pare el primer hilo,
		el segundo no puede acceder a la variable*/
		synchronized (contador) {
			for (int j = 0; j < 300; j++) {
				contador.incrementa();
				/*try {
					sleep(100);
				} catch (InterruptedException e) {		}
				*/
			}
			System.out.println(getName() + " contador vale "
					+ contador.getValor());
		}

	}
}

class HiloB2 extends Thread {
	private Contador2 contador;

	public HiloB2(String n, Contador2 c) {
		setName(n);
		contador = c;
	}

	public void run() {
		// el objeto compartido es contador
		synchronized (contador) {
			for (int j = 0; j < 300; j++) {
				contador.decrementa();
				/*try {
					sleep(100);
				} catch (InterruptedException e) {		}
				*/
			}
			System.out.println(getName() + " contador vale "
					+ contador.getValor());
		}
	}
}

public class EJ_14_HiloSynchronized {
	public static void main(String[] args) {
		Contador2 cont = new Contador2(100);
		HiloA2 a = new HiloA2("HiloA", cont);
		HiloB2 b = new HiloB2("HiloB", cont);
		a.start();		
		b.start();		
	}
}