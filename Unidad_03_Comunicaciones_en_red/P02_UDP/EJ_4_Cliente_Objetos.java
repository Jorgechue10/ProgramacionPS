package P02_UDP;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class EJ_4_Cliente_Objetos {

	public static void main(String[] args) throws IOException {

		int puerto = 9999;
		
		InetAddress destino = InetAddress.getByName("localhost"); // Obtenemos la IP del host local

		// Para decir cualquier otro host
		//InetAddress destino = InetAddress.getLocalHost();
		
		EJ_4_0_Persona persona = new EJ_4_0_Persona("Jorge", 7);

		// OBJETO A BYTES
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream out = new ObjectOutputStream(baos);

		out.writeObject(persona); //Se escribe el objeto persona en el stream

		out.close(); // Se cierra el stream

		byte[] bytes = baos.toByteArray(); //Se toma  el objeto transformado en bytes
		
		//Enviar objeto
		DatagramPacket paqueteUDP = new DatagramPacket(bytes, bytes.length, destino, puerto);
		
		//Enviamos el paquete de datos con el socket datagrama
		DatagramSocket socket = new DatagramSocket();
		socket.send(paqueteUDP);
		socket.close();
	}
}