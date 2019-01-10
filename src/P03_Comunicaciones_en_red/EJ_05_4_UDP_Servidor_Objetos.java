package P03_Comunicaciones_en_red;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class EJ_05_4_UDP_Servidor_Objetos {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		/* 
		 * En cambio, para los datos recibidos (bytes) por el datagrama en un objeto Persona habría que hacer lo siguiente:
		*/
		
		DatagramSocket socket = new DatagramSocket(9999);  
		
		//Esperando al datagrama
		System.out.println("Esperando al datagrama.....");
		// BYTES A OBJETO
		byte[] recibido = new byte[1024];
		DatagramPacket paqRecibido = new DatagramPacket(recibido, recibido.length);
		socket.receive(paqRecibido);
		
		System.out.println("Datagrama recibido");

		//Pasamos bytes a objeto
		ByteArrayInputStream bais = new ByteArrayInputStream(recibido);
		ObjectInputStream in = new ObjectInputStream(bais);
		EJ_05_0_Persona persona = (EJ_05_0_Persona)in.readObject(); //Se obtiene el objeto recibido como bytes
		in.close();		
			
		System.out.println("Nombre: "+persona.getNombre()+" Edad: "+persona.getEdad());
		
		socket.close(); //cierro el socket
	}
}