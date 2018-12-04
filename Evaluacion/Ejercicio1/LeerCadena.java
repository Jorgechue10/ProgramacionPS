package Ejercicio1;

import java.util.Scanner;

public class LeerCadena {

	public void initroducirCadena() {
		Scanner teclado=new Scanner (System.in);
		String frase; String frasefinal="";
		System.out.println("Escribe una frase: ");
		frase = teclado.nextLine();
		int i=0;
		char c=' ';
		while((i<frase.length())&&(esAsterisco(c)==false)) {
			c= frase.charAt(i);
			if (esAsterisco(c)==false) 	
				frasefinal=frasefinal+c;
			i++;
		}	
		System.out.println("La frase final es: ");
		System.out.println(frasefinal);
		teclado.close();
	}	
	
	public boolean esAsterisco(char c) {
		String asterisco="*";
		if (asterisco.indexOf(c)== -1) {
				return false;
		}
		return true;
	}
}
