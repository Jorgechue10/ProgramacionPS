package P03_Comunicaciones_en_red;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EJ_02_1_Servidor {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Creación del socket
		ServerSocket serverSocket = new ServerSocket(9999);
		
		//Abrir conexión del socket con el puerto por el que va a escuchar
		System.out.println("Abrimos el socket");
		Socket socketCliente= serverSocket.accept();
		serverSocket.close(); 
		
		InputStream is = socketCliente.getInputStream();
		
		
	}
}