package P01_Creacion;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Actividad_3_Secuencial {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int j,contador=0; 
		long t_inicio, t_fin;
		long tiempo_total;
		
		t_inicio = System.currentTimeMillis(); // tiempo en milisegundos
		for(int i=1;i<=5;i++) {
			
			File f = new File("Unidad_02_Hilos/P01_Creacion/Ficheros/fichero"+i+".txt");	
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
		//System.out.println("Inicio: "+t_inicio+"\nFin: "+t_fin);
		System.out.println("Ha tardado: "+tiempo_total+" milisegundos");
		
		
		
	}
}