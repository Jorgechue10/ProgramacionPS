package P02_Hilos_Java;

public class EJ_22_Prouc_Consum {
	  public static void main(String[] args) {  
		  EJ_19_Cola cola = new EJ_19_Cola();
		  EJ_21_Productor p = new EJ_21_Productor(cola, 1);	
		  EJ_20_Consumidor c = new EJ_20_Consumidor(cola, 1);
		
		  p.start();
		  c.start();
	  }
}