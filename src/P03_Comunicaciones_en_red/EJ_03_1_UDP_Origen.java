package P03_Comunicaciones_en_red;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class EJ_03_1_UDP_Origen {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int puerto = 9999;
		//InetAddress destino = InetAddress.getLocalHost(); // Obtenemos la IP del host local

		// Para decir cualquier otro host
		InetAddress destino = InetAddress.getByName("192.168.5.80");

		byte[] mensaje = new byte[1024];

		String saludo = "Hola Oscar soy Jorge";
		mensaje = saludo.getBytes(); // Hay que pasar la cadena a bytes para el envío

		DatagramPacket paqueteUDP = new DatagramPacket(mensaje, mensaje.length, destino, puerto);
		
		DatagramSocket socket = new DatagramSocket();
		socket.send(paqueteUDP);
		socket.close();
	}
}