package Ejercicio2_multihilo;

public class Consumidor extends Thread {
    private Cola cola;
    private int n;

    public Consumidor(Cola c, int n) {
        cola = c;
        this.n = n;
    }

    public void run() {
    	String caracter;
    	String texto="";
        for (int i = 0; i < 34; i++) {
        	caracter = cola.get(); //recoge el caracter
        	texto=texto+cola.get();
            System.out.println(i + "=>Consumidor: " + n
                               + ", consume: " + caracter);
        }
        System.out.println("El proceso del consumidor ha finalizado.......");
    }
}