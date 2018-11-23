package P02_Hilos_Java;

public class EJ_21_Productor extends Thread {
    private EJ_19_Cola cola;
    private int n;

    public EJ_21_Productor(EJ_19_Cola c, int n) {
        cola = c;
        this.n = n;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            cola.put(i); //pone el n�mero
            System.out.println(i + "=>Productor : " + n
                               + ", produce: " + i);
            try {
                sleep(100);
            } catch (InterruptedException e) { }			
			
        }
    }
}