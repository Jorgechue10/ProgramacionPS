package P02_Hilos_Java;

public class EJ_11_HiloPrioridad1 {
	public static void main(String args[]) {    
		EJ_10_HiloPrioridad h1 = new EJ_10_HiloPrioridad("Hilo1");
		EJ_10_HiloPrioridad h2 = new EJ_10_HiloPrioridad("Hilo2");
		EJ_10_HiloPrioridad h3 = new EJ_10_HiloPrioridad("Hilo3");	
		  
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