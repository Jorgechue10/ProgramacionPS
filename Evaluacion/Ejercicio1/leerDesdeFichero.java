package Ejercicio1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class leerDesdeFichero {

	public void leerFichero() throws IOException {
		File f1 = new File("Evaluacion\\Ejercicio1\\texto.txt");			
		FileReader fichero_leer = new FileReader(f1);
		int i; 
		String frasefinal="";
		while(((i=fichero_leer.read())!=-1)&&(esAsterisco((char)i)==false)) {
			frasefinal=frasefinal+(char)i;				
		}
		fichero_leer.close();
		System.out.println("La frase final es: ");
		System.out.println(frasefinal);		
	}	
	
	public boolean esAsterisco(char c) {
		String asterisco="*";
		if (asterisco.indexOf(c)== -1) {
				return false;
		}
		return true;
	}
}
