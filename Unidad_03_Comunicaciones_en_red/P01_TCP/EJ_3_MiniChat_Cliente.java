package P01_TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EJ_3_MiniChat_Cliente {

	public static void main(String[] args) throws IOException {
		
		String Host = "localhost";
		int Puerto = 6000;// puerto remoto
		Socket Cliente = new Socket(Host, Puerto);
		System.out.println("----------------CLIENTE--------------");
			
		// CREO FLUJO DE SALIDA AL SERVIDOR	
		PrintWriter fsalida = new PrintWriter (Cliente.getOutputStream(), true);
		// CREO FLUJO DE ENTRADA AL SERVIDOR	
		BufferedReader fentrada =  new BufferedReader
		     (new InputStreamReader(Cliente.getInputStream()));
			 
		// FLUJO PARA ENTRADA ESTANDAR
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String msgEnviar, msgRecibido = "";
			
		
		do{ 
			//Primero envía un mensaje al servidor
			System.out.print("Cliente=> ");
			msgEnviar = in.readLine();
			fsalida.println(msgEnviar);
			
			//Si si el mensaje enviado es distinto a 'adios', recibe respuesta.
			if (!msgEnviar.trim().equals("adios")) {
				msgRecibido=fentrada.readLine();	
				System.out.println("Servidor=> "+msgRecibido);	
			}			
		} while(!msgEnviar.trim().equals("adios") && !msgRecibido.trim().equals("adios"));
			
		fsalida.close();
		fentrada.close();
		System.out.println("Fin del chat... ");
		in.close();
		Cliente.close();
	}
}