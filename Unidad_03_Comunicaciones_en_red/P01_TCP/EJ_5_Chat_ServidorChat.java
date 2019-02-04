package P01_TCP;

import java.io.*;
import java.net.*;


public class EJ_5_Chat_ServidorChat  {
	static final int MAXIMO = 5;//MAXIMO DE CONEXIONES PERMITIDAS	
	
	public static void main(String args[]) throws IOException {
		int PUERTO = 54321;	
		
		ServerSocket servidor = new ServerSocket(PUERTO);
		System.out.println("Servidor iniciado...");
		
		Socket tabla[] = new Socket[MAXIMO];//para controlar las conexiones	
		EJ_5_Chat_ComunHilos comun = new EJ_5_Chat_ComunHilos(MAXIMO, 0, 0, tabla);
		
		while (comun.getCONEXIONES() < MAXIMO) {
			Socket socket = new Socket();			
			socket = servidor.accept();// esperando cliente
			
			comun.addTabla(socket, comun.getCONEXIONES());
			comun.setACTUALES(comun.getACTUALES() + 1);
			comun.setCONEXIONES(comun.getCONEXIONES() + 1);			
			
			EJ_5_Chat_HiloServidorChat hilo = new EJ_5_Chat_HiloServidorChat(socket, comun);
			Thread t = new Thread(hilo);
			t.start();
		}	
		servidor.close();
	}//main
}//ServidorChat..  
