package P04_Servicios_en_red;

import java.io.*;
import org.apache.commons.net.ftp.*;

public class EJ_06_RenombrarYBorrarFicheroSubidoFTP {
	public static void main(String[] args) {
		FTPClient cliente = new FTPClient();

		String servidor = "localhost";
		String user = "jorge";
		String pasw = "1234";

		try {
			System.out.println("Conectandose a " + servidor);
			cliente.connect(servidor);
			cliente.enterLocalPassiveMode();
			boolean login = cliente.login(user, pasw);
			
			cliente.setFileType(FTP.BINARY_FILE_TYPE);
			String direc = "/NUEVODIREC";
			

			if (login) {				
				System.out.println("Login correcto");
                
				if (!cliente.changeWorkingDirectory(direc)) {
					String directorio = "NUEVODIREC";
					
					if (cliente.makeDirectory(directorio)) {
						System.out.println("Directorio :  " + directorio + " creado ...");
						cliente.changeWorkingDirectory(directorio);
					} else {
						System.out.println("No se ha podido crear el Directorio");
						System.exit(0);
					}					
				}				

				System.out.println("Directorio actual: " +
				   cliente.printWorkingDirectory());					
								
				//Renombrar fichero
				direc="/NUEVODIREC";
				cliente.changeWorkingDirectory(direc);
				if(cliente.rename("fichero_a_renombrar.txt", "fichero_renombrado.txt")) 
					System.out.println("Fichero renombrado... ");
				else
					System.out.println("No se ha podido renombar el Fichero... ");

				
				System.out.println("\nDespues de renombrar el fichero: ");
				VerFicheros(cliente);

				//eliminar fichero
				String fichero = "/NUEVODIREC/fichero_renombrado.txt";
				if(cliente.deleteFile(fichero)) 
					System.out.println("Fichero eliminado... ");
				else
					System.out.println("No se ha podido eliminar Fichero... ");

				System.out.println("\nDespues de eliminar el fichero: ");
				VerFicheros(cliente);
				
				
				cliente.logout();
				cliente.disconnect();
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}// main

	private static void VerFicheros(FTPClient client) throws IOException {
	
		FTPFile[] files = client.listFiles(client.printWorkingDirectory());
		System.out.println("Ficheros en el directorio actual:" + files.length);

		String tipos[] = { "Fichero", "Directorio" };

		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i].getName() + " * " + tipos[files[i].getType()]);
		}
	}// VerFicheros
}// ..