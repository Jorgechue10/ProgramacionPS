package P03_Comunicaciones_en_red;

import java.io.*;
import java.net.*;


public class EJ_06_Chat_TCP_ServidorChat  {
	static final int MAXIMO = 5;//MAXIMO DE CONEXIONES PERMITIDAS	
	
	public static void main(String args[]) throws IOException {
		int PUERTO = 54321;	
		
		ServerSocket servidor = new ServerSocket(PUERTO);
		System.out.println("Servidor iniciado...");
		
		Socket tabla[] = new Socket[MAXIMO];//para controlar las conexiones	
		EJ_06_Chat_TCP_ComunHilos comun = new EJ_06_Chat_TCP_ComunHilos(MAXIMO, 0, 0, tabla);
		
		while (comun.getCONEXIONES() < MAXIMO) {
			Socket socket = new Socket();			
			socket = servidor.accept();// esperando cliente
			
			comun.addTabla(socket, comun.getCONEXIONES());
			comun.setACTUALES(comun.getACTUALES() + 1);
			comun.setCONEXIONES(comun.getCONEXIONES() + 1);			
			
			EJ_06_Chat_TCP_HiloServidorChat hilo = new EJ_06_Chat_TCP_HiloServidorChat(socket, comun);
			Thread t = new Thread(hilo);
			t.start();
		}	
		servidor.close();
	}//main
}//ServidorChat..  
