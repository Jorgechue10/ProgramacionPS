package P01_TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EJ_3_MiniChat_Servidor {

	public static void main(String[] args) throws IOException {

		int numeroPuerto = 6000;// Puerto
		ServerSocket servidor = new ServerSocket(numeroPuerto);
		Socket clienteConectado = null;
		System.out.println("----------------SERVIDOR--------------");
		System.out.println("Esperando mensaje del cliente.....");
		clienteConectado = servidor.accept();
	
		// CREO FLUJO DE ENTRADA AL CLIENTE
		BufferedReader fentrada =  new BufferedReader
			     (new InputStreamReader(clienteConectado.getInputStream()));
	
		// CREO FLUJO DE SALIDA AL CLIENTE
		PrintWriter fsalida = new PrintWriter (clienteConectado.getOutputStream(), true);
	
		// FLUJO PARA ENTRADA ESTANDAR
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String msgEnviar = "", msgRecibido;
	
		do{ 
			//Primero recibe el mensaje del cliente
			msgRecibido=fentrada.readLine();	
			System.out.println("Cliente=> "+msgRecibido);
			
			//Si el mensaje recibido es distinto a 'adios', escribe respuesta.
			if (!msgRecibido.trim().equals("adios")) {
				System.out.print("Servidor=> ");
				msgEnviar = in.readLine();
				fsalida.println(msgEnviar);	
			}			
		} while(!msgEnviar.trim().equals("adios")  && !msgRecibido.trim().equals("adios"));
		
		// CERRAR STREAMS Y SOCKETS
		fsalida.close();
		fentrada.close();
		System.out.println("Fin del chat... ");
		in.close();
		servidor.close();
	}
}