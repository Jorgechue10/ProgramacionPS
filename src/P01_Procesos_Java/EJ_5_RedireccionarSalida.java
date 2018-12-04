package P01_Procesos_Java;

import java.io.File;
import java.io.IOException;

public class EJ_5_RedireccionarSalida {

	public static void main(String args[]) throws IOException {
	    
		ProcessBuilder pb = new ProcessBuilder("CMD","/C" ,"DIR");
	    
	    File fOut = new File("salida.txt");
	    File fErr = new File("error.txt");
	 
	    pb.redirectOutput(fOut);
	    pb.redirectError(fErr); 
	    pb.start();
	}	
}