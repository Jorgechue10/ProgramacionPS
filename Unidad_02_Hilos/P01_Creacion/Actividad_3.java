package P01_Creacion;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Actividad_3 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int j,contador=0; 
		long t_inicio, t_fin;
		long tiempo_total;
		
		t_inicio = System.currentTimeMillis(); // tiempo en milisegundos
		for(int i=1;i<=5;i++) {
			
			File f = new File("C:\\Users\\ifc\\git\\ProgramacionPS\\src\\P02_Hilos_Java\\Ficheros\\fichero"+i+".txt");	
			FileReader fr = new FileReader(f);
			contador=0; 		
			while((j=fr.read())!=-1) {
				contador++;
			}
			System.out.println("El fichero "+i+" tiene "+contador+" carácteres");
			fr.close();
		}		
		t_fin = System.currentTimeMillis();
		
		tiempo_total = t_fin - t_inicio;
		System.out.println("Ha tardado: "+tiempo_total);
		
		
		
	}
}