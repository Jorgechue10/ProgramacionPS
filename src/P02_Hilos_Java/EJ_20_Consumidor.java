package P02_Hilos_Java;

public class EJ_20_Consumidor extends Thread {
    private EJ_19_Cola cola;
    private int n;

    public EJ_20_Consumidor(EJ_19_Cola c, int n) {
        cola = c;
        this.n = n;
    }

    public void run() {
        int valor = 0;
        for (int i = 0; i < 5; i++) {
            valor = cola.get(); //recoge el número
            System.out.println(i + "=>Consumidor: " + n
                               + ", consume: " + valor);
        }
    }
}