package P01_Protocolo_FTP;

import java.io.*;
import org.apache.commons.net.ftp.*;

public class EJ_6_SubirFicheroFTP {
	  public static void main(String[] args) {
		FTPClient cliente = new FTPClient();

		String servidor = "localhost";
		String user = "usuario1";
		String pasw = "1234";

		try {
		   System.out.println("Conectandose a " + servidor);
		   cliente.connect(servidor);
		   boolean login = cliente.login(user, pasw);
			
		   cliente.setFileType(FTP.BINARY_FILE_TYPE);
		   
		   //Carpeta donde queremos subir el archivo
		   String directorio = "/carpeta2";
		   cliente.enterLocalPassiveMode();

		   if (login) {				
			 System.out.println("Login correcto");
	                 
			 //Si no existe la carpeta, que la cree
			 if (!cliente.changeWorkingDirectory(directorio)) {
					
			    if (cliente.makeDirectory(directorio)) {
				System.out.println("Directorio :  " + 
	                                  directorio + " creado ...");
	                  cliente.changeWorkingDirectory(directorio);
			    } else {
				System.out.println("No se ha podido crear el Directorio");
				System.exit(0);
			    }					
			  }
				
			  System.out.println("Directorio actual: " +
				   cliente.printWorkingDirectory());
					
			  String archivo ="Unidad_04_Servicios_en_red/P01_Protocolo_FTP/Ficheros/ej_6_fichero_subir.txt";				
			  BufferedInputStream in = new BufferedInputStream
						(new FileInputStream(archivo));
				
			  if (cliente.storeFile("fichero_subido_desde_java.txt", in))
				   System.out.println("Subido correctamente... ");
				else
				   System.out.println("No se ha podido subir el fichero... ");					
		
			  in.close(); // Cerrar flujo
			  cliente.logout();
			  cliente.disconnect();
		   }

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
  }// main			
}// ..