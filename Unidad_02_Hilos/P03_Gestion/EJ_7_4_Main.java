package P03_Gestion;

public class EJ_7_4_Main {
	  public static void main(String[] args) {  
		  EJ_7_1_Cola cola = new EJ_7_1_Cola();
		  EJ_7_3_Productor p = new EJ_7_3_Productor(cola, 1);	
		  EJ_7_2_Consumidor c = new EJ_7_2_Consumidor(cola, 1);
		
		  p.start();
		  c.start();
	  }
}