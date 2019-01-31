package P03_Gestion;

public class EJ_3_1_2_HiloPrioridad_Ejecucion {
	public static void main(String args[]) {    
		EJ_3_1_1_HiloPrioridad h1 = new EJ_3_1_1_HiloPrioridad("Hilo1");
		EJ_3_1_1_HiloPrioridad h2 = new EJ_3_1_1_HiloPrioridad("Hilo2");
		EJ_3_1_1_HiloPrioridad h3 = new EJ_3_1_1_HiloPrioridad("Hilo3");	
		  
		h1.setPriority(Thread.NORM_PRIORITY);
		h2.setPriority(Thread.MAX_PRIORITY);    
		h3.setPriority(Thread.MIN_PRIORITY);   
		
		h1.start();	
		h2.start();
	    h3.start();  	

	   try {
	      Thread.sleep(10000);
	    } catch (Exception e) { }


	    h1.pararHilo();
	    h2.pararHilo();
		h3.pararHilo();
		
	    System.out.println("h2 (Prioridad Maxima): " + h2.getContador());
		System.out.println("h1 (Prioridad Normal): " + h1.getContador());  	
		System.out.println("h3 (Prioridad Minima): " + h3.getContador());

	  }
}