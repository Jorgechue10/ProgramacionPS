/*
	* Importante crear en los dos lados los flujos de entrada y salida. Primero se crea el de salida y luego el de entrada.
	* Ver Javadoc object stream header
	* El modelo que se use como objeto a intercambiar debe ser serializable (implementar dicho interface)
*/

package P01_TCP;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class EJ_3_Cliente_Objetos {
	public static void main(String[] arg) throws IOException,ClassNotFoundException {
	    
		String Host = "localhost";
	    int Puerto = 6543;//puerto del servidor	
			
	    System.out.println("PROGRAMA CLIENTE INICIADO....");
	    Socket cliente = new Socket(Host, Puerto);	
		
	    //Flujo de entrada
	    ObjectInputStream objEntrada = new ObjectInputStream(cliente.getInputStream());
	    
	    //Se recibe un objeto
	    EJ_3_0_Persona personaRec = (EJ_3_0_Persona) objEntrada.readObject();//recibo objeto
	    System.out.println("Recibo: " +personaRec.getNombre()+"*" +personaRec.getEdad());
		
	    //Modifico el objeto
	    personaRec.setNombre("Jorge Chueca");
	    personaRec.setEdad(19);
		
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