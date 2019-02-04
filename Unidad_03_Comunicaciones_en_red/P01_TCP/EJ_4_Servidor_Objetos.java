package P01_TCP;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EJ_4_Servidor_Objetos {
	public static void main(String[] arg) throws IOException, ClassNotFoundException {
	   
		int numeroPuerto = 6543;// Puerto local para el envío
		ServerSocket servidor =  new ServerSocket(numeroPuerto);
		System.out.println("Esperando al cliente.....");   
		Socket cliente = servidor.accept();
		
		//flujo de salida para objetos 		
		ObjectOutputStream objSalida = new ObjectOutputStream(cliente.getOutputStream()); 	
	   
		// Se prepara un objeto y se envía 
		EJ_4_0_Persona persona = new EJ_4_0_Persona("Pedro", 43);
		objSalida.writeObject(persona); //enviando objeto
		System.out.println("Envio: " + persona.getNombre() +", "+ persona.getEdad());  

	   
		// Se obtiene un stream para leer objetos
		ObjectInputStream objetoEntrada = new ObjectInputStream(cliente.getInputStream());
		EJ_4_0_Persona dato = (EJ_4_0_Persona) objetoEntrada.readObject();
	  	System.out.println("Recibo: "+dato.getNombre()+", "+dato.getEdad());
			
	  	// CERRAR STREAMS Y SOCKETS
	  	objSalida.close();
	  	objetoEntrada.close();
	  	cliente.close();
	  	servidor.close();
	}
}