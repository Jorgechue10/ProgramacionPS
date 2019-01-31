package P03_Gestion;

public class EJ_2_2_Join {
	  
	public static void main(String[] args)  {
		EJ_2_1_HiloJoin h1 = new EJ_2_1_HiloJoin("Hilo1",2);
		EJ_2_1_HiloJoin h2 = new EJ_2_1_HiloJoin("Hilo2",5);
		EJ_2_1_HiloJoin h3 = new EJ_2_1_HiloJoin("Hilo3",7);
   
		h1.start();
		h2.start();
		h3.start();
	  
   
		try {
			h1.join(); h2.join(); h3.join(); 
	   	} catch (InterruptedException e) { }		
		
		System.out.println("FINAL DE PROGRAMA");	
	}
}