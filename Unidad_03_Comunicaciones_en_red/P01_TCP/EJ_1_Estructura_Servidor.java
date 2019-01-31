package P01_TCP;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EJ_1_Estructura_Servidor {

	public static void main(String[] args) throws IOException {

		int Puerto = 6000;// Puerto 
		ServerSocket Servidor = new ServerSocket(Puerto);
		
		System.out.println("Escuchando en " + Servidor.getLocalPort());	
		Socket cliente1= Servidor.accept();//esperando a un cliente 
		//realizar acciones con cliente1
		
		Socket cliente2 = Servidor.accept();//esperando a otro cliente
		//realizar acciones con cliente2
		
		Servidor.close();	//cierro socket servidor
	}
}