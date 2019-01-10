package P03_Comunicaciones_en_red;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class EJ_05_2_TCP_Ciente_Objetos {
	  public static void main(String[] arg) throws IOException,ClassNotFoundException {
	    
	    String Host = "localhost";
	    int Puerto = 6543;//puerto del servidor	
			
	    System.out.println("PROGRAMA CLIENTE INICIADO....");
	    Socket cliente = new Socket(Host, Puerto);	
		
	    //Flujo de entrada
	    ObjectInputStream objEntrada = new ObjectInputStream(cliente.getInputStream());
	    
	    //Se recibe un objeto
	    EJ_05_0_Persona personaRec = (EJ_05_0_Persona) objEntrada.readObject();//recibo objeto
	    System.out.println("Recibo: " +personaRec.getNombre()+"*" +personaRec.getEdad());
		
	    //Modifico el objeto
	    personaRec.setNombre("Pepito Perez");
	    personaRec.setEdad(55);
		
	    //Flujo de salida
	    ObjectOutputStream objSalida = new ObjectOutputStream(cliente.getOutputStream());
	    
	    // Se envía el objeto
	    objSalida.writeObject(personaRec);
	    System.out.println("Envio: " +personaRec.getNombre()+", " +personaRec.getEdad());                       
			
	    // CERRAR STREAMS Y SOCKETS
	    objEntrada.close();
	    objSalida.close();
	    cliente.close();		
	  }
	}
