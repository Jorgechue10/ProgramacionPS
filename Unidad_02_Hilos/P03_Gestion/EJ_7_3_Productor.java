package P03_Gestion;

public class EJ_7_3_Productor extends Thread {
    private EJ_7_1_Cola cola;
    private int n;

    public EJ_7_3_Productor(EJ_7_1_Cola c, int n) {
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