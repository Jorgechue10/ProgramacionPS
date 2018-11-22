package P02_Hilos_Java;

public class EJ_8_Interrupcion extends Thread {
	  public void run() {
		    try {
		      while (!isInterrupted()) {
		        System.out.println("En el Hilo");
			    Thread.sleep(1);
		      }
		      } catch (InterruptedException e) {
			     System.out.println("HA OCURRIDO UNA EXCEPCIÓN");
			  }
		      
		      System.out.println("FIN HILO");
		   }
		  
		  
		   public void interrumpir() {
		       interrupt();
		   }
		   
		   public static void main(String[] args) {
			   EJ_8_Interrupcion h = new EJ_8_Interrupcion();
			   h.start();
			   for(int i=0; i<1000000000; i++) ;//no hago nada
			   for(int i=0; i<1000000000; i++) ;//no hago nada
			   for(int i=0; i<1000000000; i++) ;//no hago nada
			   h.interrumpir();
	  }
}