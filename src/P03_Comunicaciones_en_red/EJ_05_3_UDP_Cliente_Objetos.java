package P03_Comunicaciones_en_red;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class EJ_05_3_UDP_Cliente_Objetos {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int puerto = 9999;
		//InetAddress destino = InetAddress.getLocalHost(); // Obtenemos la IP del host local

		// Para decir cualquier otro host
		InetAddress destino = InetAddress.getByName("localhost");

		ByteArrayOutputStream bOutput = new ByteArrayOutputStream();
		
		
		EJ_05_0_Persona persona = new EJ_05_0_Persona("Jorge", 7);

		// OBJETO A BYTES
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream out = new ObjectOutputStream(baos);

		out.writeObject(persona); //Se escribe el objeto persona en el stream

		out.close(); // Se cierra el stream

		byte[] bytes = baos.toByteArray(); // se toma  el objeto transformado en bytes
		

		DatagramPacket paqueteUDP = new DatagramPacket(bytes, bytes.length, destino, puerto);
		
		DatagramSocket socket = new DatagramSocket();
		socket.send(paqueteUDP);
		socket.close();
	}
}