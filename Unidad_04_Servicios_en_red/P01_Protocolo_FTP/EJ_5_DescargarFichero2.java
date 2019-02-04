package P01_Protocolo_FTP;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;

public class EJ_5_DescargarFichero2 {

	public static void main(String[] args) {
		
		FTPClient cliente = new FTPClient();
		String servFTP = "localhost";
		System.out.println("Nos conectamos a: " + servFTP);
		String usuario = "usuario1";
		String clave = "1234";
		
		try {
			cliente.connect(servFTP);
	        cliente.enterLocalPassiveMode(); //modo pasivo

			boolean login = cliente.login(usuario, clave);
			
			if (login)
				System.out.println("Login correcto...");
			else {
				System.out.println("Login Incorrecto...");
				cliente.disconnect();
				System.exit(1);
			}

			System.out.println("Directorio actual: "
					         + cliente.printWorkingDirectory());

			//CAMBIAR DE DIRECTORIO
			cliente.changeWorkingDirectory("/carpeta1");
			System.out.println("Cambio de directorio a "+cliente.printWorkingDirectory());
			//
			
			FTPFile[] files = cliente.listFiles();
			System.out.println("Ficheros en el directorio actual:"
						+ files.length);
	            //array para visualizar el tipo de fichero
			String tipos[] = {"Fichero", "Directorio","Enlace simb."};
			
			for (int i = 0; i < files.length; i++) {
				System.out.println("\t" + files[i].getName() + " => "
						+ tipos[files[i].getType()]);
			}
			
			//RECUPERAR EL FICHERO
			String nombreFichero = "";
			BufferedOutputStream out = null;
			//recorre la lista de archivos
			for(int i = 0; i < files.length; i++) {
				//si es un fichero, los descarga con el BufferedOutputStream
				if(files[i].getType() == 0) {
					nombreFichero = files[i].getName();
					out = new BufferedOutputStream(new FileOutputStream(
							"Unidad_04_Servicios_en_red/P01_Protocolo_FTP/Ficheros/ej_5_2_"+nombreFichero));
					
					if(cliente.retrieveFile(nombreFichero, out))
						System.out.println("El fichero "+nombreFichero+" ha sido descargado");
					else
						System.out.println("No se ha podido descargar... ");					
				}
			}
			out.close();
			
			cliente.logout();
			cliente.disconnect();
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}