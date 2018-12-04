package Ejercicio2_multihilo;

public class Produc_Consum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cola cola = new Cola();
		
	    Productor p = new Productor(cola, "Evaluacion\\Ejercicio2_multihilo\\texto.txt");	
		Consumidor c = new Consumidor(cola, 1);
		Consumidor c1 = new Consumidor(cola, 1);
		Consumidor c2 = new Consumidor(cola, 1);
		Consumidor c3 = new Consumidor(cola, 1);
		
	    p.start();
		c.start();
		c1.start();
		c2.start();
		c3.start();
		c.getState();
		c1.getState();
		c2.getState();
		c3.getState();
	}
}