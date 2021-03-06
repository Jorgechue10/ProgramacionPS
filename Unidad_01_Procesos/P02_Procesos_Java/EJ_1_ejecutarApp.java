/**
 * Process & ProcessBuilder
 * Ejecutar una aplicación del S.O.
 */
package P02_Procesos_Java;

import java.io.IOException;
import java.io.InputStream;

public class EJ_1_ejecutarApp {

	public static void main(String[] args) throws IOException {
		
		// LINUX
		// final String orden[] = {"ls", "/"};
		// Process proceso = new ProcessBuilder(orden).start();

		// WINDOWS
		Process proceso1 = new ProcessBuilder("NOTEPAD").start();
		/*Process proceso2 = new ProcessBuilder("EXPLORER").start();
		Process proceso3 = new ProcessBuilder("MSPAINT").start();*/
			    
	    // Comprobar si el proceso ha finalizado de forma correcta
	    //  0 Bien
	    // -1 Mal 
	    
	    int valorSalida;
	    
	    try {
	    	valorSalida = proceso1.waitFor();
	    	System.out.print("Valor de salida: " + valorSalida);
	    }catch (Exception e) {
	        e.printStackTrace();
	    }	  	        
	}	
}