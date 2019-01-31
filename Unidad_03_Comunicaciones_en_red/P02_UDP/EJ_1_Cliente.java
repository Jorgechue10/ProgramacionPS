package P02_UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class EJ_1_Cliente {

	public static void main(String[] args) throws IOException {

		int puerto = 9999;
		InetAddress destino = InetAddress.getLocalHost(); // Obtenemos la IP del host local

		// Para decir cualquier otro host
		//InetAddress destino = InetAddress.getByName("192.168.4.139");

		byte[] mensaje = new byte[1024];

		String saludo = "Hola Servidor, soy Jorge";
		mensaje = saludo.getBytes(); // Hay que pasar la cadena a bytes para el envío

		DatagramPacket paqueteUDP = new DatagramPacket(mensaje, mensaje.length, destino, puerto);
		
		DatagramSocket socket = new DatagramSocket();
		socket.send(paqueteUDP);
		socket.close();
	}
}