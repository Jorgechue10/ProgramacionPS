package P01_Seguridad_en_Java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EJ_2_Permisos {
     
      public static void main(String[] args) {
           
            //El directorio C:/Ficheros debe estar creado previamente.
            System.setProperty ("java.security.policy", "C:\\Users\\ifc\\git\\ProgramacionPS\\Unidad_05_Seguridad\\P01_Seguridad_en_Java\\Ficheros\\Politica2.policy");
            System.setSecurityManager(new SecurityManager());
            try {
                  //escritura en fichero
                  BufferedWriter fichero = new BufferedWriter (new FileWriter("Unidad_05_Seguridad\\P01_Seguridad_en_Java\\Ficheros\\fichero.txt"));
                  fichero.write("Escritura de una linea en fichero.");
                  fichero.newLine(); // escribe un salto de línea
                  fichero.close();
                  System.out.println("Final proceso de escritura...");
                 
                  //lectura del fichero
                  BufferedReader fichero2 = new BufferedReader (new FileReader("Unidad_05_Seguridad\\P01_Seguridad_en_Java\\Ficheros\\fichero.txt"));
                  String linea = fichero2.readLine();
                  System.out.println("Contenido del fichero: ");
                  System.out.println("\t" + linea);
                  fichero2.close();
                  System.out.println("Final proceso de lectura...");
            } catch (FileNotFoundException fn) {
                  System.out.println("No se encuentra el fichero");
            } catch (IOException io) {
                  System.out.println("Error de E/S ");
            } catch (Exception e) {
                  System.out.println("ERROR => " + e.toString());
            }//Fin de try
           
      }// Fin de main   
}// Fin de Ejemplo2