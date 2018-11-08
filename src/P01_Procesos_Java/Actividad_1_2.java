package P01_Procesos_Java;

import java.io.InputStream;

public class Actividad_1_2 {

	public void ejecutar(String[] argumentos) {
		String clase="com.P01_Pocesos_Java.Actividad_1_1";
		Process p;
		
		try {
	        p = new ProcessBuilder("java", clase, argumentos[0]).start();
	        //pb.start();
	        
	        try {
	        	InputStream is = p.getInputStream();
	        	int c;
	        	
	        	while ((c = is.read()) != -1)
	        		System.out.print((char) c);
	        	is.close();
	        }catch (Exception e) {
		        e.printStackTrace();
		    }
		    
		    
		    // Comprobar si el proceso ha finalizado de forma correcta
		    //  0 Bien
		    // -1 Mal 
		    
		    int valorSalida;
		    
		    try {
		    	valorSalida = p.waitFor();
		    	System.out.println("Valor de salida: " + valorSalida);
		    }catch (Exception e) {
		        e.printStackTrace();
		    }
		    
	    } catch (Exception e) {
	        e.printStackTrace();
	    }		
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Actividad_1_2 a=new Actividad_1_2();
		
		String[] numero = new String[1];
		
		
	    a.ejecutar(args);
	    
		
		
		
		
		
	}
}