package P03_Gestion;

public class EJ_7_2_Consumidor extends Thread {
    private EJ_7_1_Cola cola;
    private int n;

    public EJ_7_2_Consumidor(EJ_7_1_Cola c, int n) {
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