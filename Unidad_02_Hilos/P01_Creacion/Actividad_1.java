package P01_Creacion;

/*Crea una clase para visualizar el mensaje "Hola Mundo!". 
 * A continuación, crea un programa que visualice el mensaje anterior cinco 
 * veces creando para ello cinco hilos diferenes usando la clase anterior. 
 * Modifica el mensaje "Hola mundo!" en el hilo para incluir el identificador 
 * de hilo.*/

public class Actividad_1 extends Thread {
	
	// constructor
	public Actividad_1(String nombre) {
		super(nombre);
	}

	// método run
	public void run() {
		System.out.println("Hola Mundo -> Nombre de hilo: "+this.getName()+" -> Id de hilo: "+this.getId());
	}

	//
	public static void main(String[] args) {
		Actividad_1 h1 = new Actividad_1("Hilo 1");
		Actividad_1 h2 = new Actividad_1("Hilo 2");
		Actividad_1 h3 = new Actividad_1("Hilo 3");
		Actividad_1 h4 = new Actividad_1("Hilo 4");
		Actividad_1 h5 = new Actividad_1("Hilo 5");
			
		h1.start();
		h2.start();
		h3.start();
		h4.start();
		h5.start();
		
		System.out.println("5 HILOS INICIADOS...");
	}// main
	

}