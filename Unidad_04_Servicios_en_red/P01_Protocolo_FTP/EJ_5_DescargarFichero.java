package P01_Protocolo_FTP;

import java.io.*;
import org.apache.commons.net.ftp.*;

public class EJ_5_DescargarFichero {
	public static void main(String[] args) {
		FTPClient cliente = new FTPClient();
		
	    String servidor = "localhost";
		String user = "usuario1";
		String pasw = "1234";

		try {
			System.out.println("Conectandose a " + servidor);
			cliente.connect(servidor);			
			cliente.enterLocalPassiveMode();
			boolean login = cliente.login(user, pasw);		
			
			if (login) {
				System.out.println("Login correcto");		

				//Elegimos la carpeta donde se encuentra el fichero a descargar
				String direc = "/carpeta1";
				cliente.changeWorkingDirectory(direc); 		
				
				//stream de salida para recibir el fichero descargado
				BufferedOutputStream out = new BufferedOutputStream(
					new FileOutputStream("Unidad_04_Servicios_en_red/P01_Protocolo_FTP/Ficheros/ej_5_1_fichero_descargado.txt"));
				
				if(cliente.retrieveFile("fichero1_c1.txt", out))
					System.out.println("Recuperado correctamente... ");
				else
					System.out.println("No se ha podido descargar... ");
				
				out.close();
	
				cliente.logout();
				cliente.disconnect();
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}//main

	
}//..