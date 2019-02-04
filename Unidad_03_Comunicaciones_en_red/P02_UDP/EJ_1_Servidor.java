package P02_UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class EJ_1_Servidor {

	public static void main(String[] args) throws IOException {

		byte[] bufer = new byte[1024];
		
		DatagramSocket socket = new DatagramSocket(9999);   

		//ESPERANDO DATAGRAMA
		System.out.println("Esperando Datagrama .......... ");  
		DatagramPacket recibo = new DatagramPacket(bufer, bufer.length);

		socket.receive(recibo);//recibo datagrama

		int bytesRec = recibo.getLength();//obtengo numero de bytes
		String paquete= new String(recibo.getData());//obtengo String

		//VISUALIZO INFORMACIÓN
		System.out.println("Número de Bytes recibidos: "+ bytesRec);    
		System.out.println("Contenido del Paquete    : "+ paquete.trim());
		System.out.println("Puerto origen del mensaje: "+ recibo.getPort());
		System.out.println("IP de origen             : "+
		                             recibo.getAddress().getHostAddress());   
		System.out.println("Puerto destino del mensaje: " + 
		                             socket.getLocalPort());	
		socket.close(); //cierro el socket
	}
}