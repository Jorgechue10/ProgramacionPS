package P03_Gestion;

public class EJ_3_2_HiloPrioridad extends Thread {
	EJ_3_2_HiloPrioridad(String nom) {
        this.setName(nom);
    }
    
    public void run() {
        System.out.println("Ejecutando [" + getName() + "]");
        for (int i = 1; i <= 5; i++) 
            System.out.println("\t("+getName()+": " + i+")");   
    } 
    
    public static void main(String[] args) {
    	EJ_3_2_HiloPrioridad h1 = new EJ_3_2_HiloPrioridad("Uno");
    	EJ_3_2_HiloPrioridad h2 = new EJ_3_2_HiloPrioridad("Dos");
    	EJ_3_2_HiloPrioridad h3 = new EJ_3_2_HiloPrioridad("Tres");
    	EJ_3_2_HiloPrioridad h4 = new EJ_3_2_HiloPrioridad("Cuatro");
    	EJ_3_2_HiloPrioridad h5 = new EJ_3_2_HiloPrioridad("Cinco");    
       
    	//asignamos prioridad
    	h1.setPriority(Thread.MIN_PRIORITY);
    	h2.setPriority(3); 
    	h3.setPriority(Thread.NORM_PRIORITY);
    	h4.setPriority(7); 
    	h5.setPriority(Thread.MAX_PRIORITY);
	   
    	//se ejecutan los hilos
    	h1.start();
    	h2.start();
    	h3.start();
    	h4.start();
    	h5.start();
    }
}