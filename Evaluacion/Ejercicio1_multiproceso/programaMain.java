package Ejercicio1_multiproceso;

import java.io.IOException;

public class programaMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Llama primero a la clase LeerCadena
		System.out.println("LLAMANDO A LA CLASE LeerCadena....");
		LeerCadena l=new LeerCadena();
		l.initroducirCadena();
		
		System.out.println("LLAMANDO A LA CLASE leerDesdeFichero....");
		//Después llama a la clase leerDesdeFichero
		leerDesdeFichero f=new leerDesdeFichero();
		f.leerFichero();
	}	
}
