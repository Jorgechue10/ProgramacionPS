package Ejercicio2_multihilo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Productor extends Thread {
    private Cola cola;
    private String n;
    private int numero;

    public Productor(Cola c, String n) {
        cola = c;
        this.n = n;
    }

    public void run() {
    	try {
	    	File f1 = new File(n);			
			FileReader fichero_leer = new FileReader(f1);
			int i; 
			while((i=fichero_leer.read())!=-1) {
				cola.put((char)i); //pone el texto
	            System.out.println("=>Productor : " 
	                               + i + ", produce: " + (char)i);
	            try {
	                sleep(100);
	            } catch (InterruptedException e) { }			
			}
			this.numero=i;
		fichero_leer.close();
    	} catch (IOException e) { }	
    	System.out.println("El proceso del productor ha finalizado.......");
    }
    
    public int getNumero(){
    	return numero;
    }
}