package P01_TCP;

import java.io.*;
import java.net.*;

public class EJ_5_Chat_HiloServidorChat implements Runnable {
	DataInputStream fentrada;
	Socket socket = null;
	EJ_5_Chat_ComunHilos comun;

	public EJ_5_Chat_HiloServidorChat(Socket s, EJ_5_Chat_ComunHilos comun) {
		this.socket = s;
		this.comun = comun;
		try {
			// CREO FLUJO DE entrada para leer los mensajes
			fentrada = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			System.out.println("ERROR DE E/S");
			e.printStackTrace();
		}
	}// ..

	public void run() {
		System.out.println("NUMERO DE CONEXIONES ACTUALES: " + comun.getACTUALES());

		// NADA MAS CONECTARSE LE ENVIO TODOS LOS MENSAJES
		String texto = comun.getMensajes();
		EnviarMensajesaTodos(texto);

		while (true) {
			String cadena = "";
			try {
				cadena = fentrada.readUTF();
				
				if (haEscritoAdios(cadena)) {// EL CLIENTE SE DESCONECTA
					cadena = " > Abandona el Chat ... " + nombreAbandona(cadena);
					comun.setACTUALES(comun.getACTUALES() - 1);
					System.out.println("NUMERO DE CONEXIONES ACTUALES: " + comun.getACTUALES());
					break;
				}				
				
				comun.setMensajes(comun.getMensajes() + cadena + "\n");
				EnviarMensajesaTodos(comun.getMensajes());
			} catch (Exception e) {
				e.printStackTrace();
				break;
			}
		} // fin while

		// se cierra el socket del cliente
		try {
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}// run

	// ENVIA LOS MENSAJES DEL CHAT A LOS CLIENTES
	private void EnviarMensajesaTodos(String texto) {
		int i;
		// recorremos tabla de sockets para enviarles los mensajes
		for (i = 0; i < comun.getCONEXIONES(); i++) {
			Socket s1 = comun.getElementoTabla(i);
			if (!s1.isClosed()) {
				try {
					DataOutputStream fsalida = new DataOutputStream(s1.getOutputStream());
					fsalida.writeUTF(texto);					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} // for
		
	}// EnviarMensajesaTodos
	
	//Método para voltear la cadena
	private boolean haEscritoAdios(String cadena) {
		
		if(cadena.charAt(1) != '>') {
			
			String[] array;
			array = cadena.split(">");	
			if (array[1].trim().equals("adios")) return true;
		}
		return false;		
	}
	
	//Método para voltear la cadena
	private String nombreAbandona(String cadena) {
		
		String[] array;
		array = cadena.split(">");	
		return array[0].trim();		
			
	}
}// ..HiloServidorChat