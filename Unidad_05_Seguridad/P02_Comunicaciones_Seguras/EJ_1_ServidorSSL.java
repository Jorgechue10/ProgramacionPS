package P02_Comunicaciones_Seguras;

import java.io.*;
import javax.net.ssl.*;

public class EJ_1_ServidorSSL {
     
      public static void main(String[] arg) throws IOException {
           
           
            //System.setProperty("javax.net.ssl.keyStore", System.getProperty("user.dir") + "\\AlmacenSSL_Servidor");
            //System.setProperty("javax.net.ssl.keyStorePassword", "1234567");
           
           
            int puerto = 6000;
            SSLServerSocketFactory sfact = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
            SSLServerSocket servidorSSL = (SSLServerSocket) sfact.createServerSocket(puerto);
            SSLSocket clienteConectado = null;
            DataInputStream flujoEntrada = null; //FLUJO DE ENTRADA DE CLIENTE
            DataOutputStream flujoSalida = null; //FLUJO DE SALIDA AL CLIENTE
           
            for (int i = 1; i < 5; i++) {
                 
                  System.out.println("Esperando al cliente " + i);
                  clienteConectado = (SSLSocket) servidorSSL.accept();
                  flujoEntrada = new DataInputStream(clienteConectado.getInputStream());
                  // EL CLIENTE ME ENVIA UN MENSAJE
                  System.out.println("Recibiendo del CLIENTE: " + i + " \n\t" + flujoEntrada.readUTF());
                  flujoSalida = new DataOutputStream(clienteConectado.getOutputStream());
                  // ENVIO UN SALUDO AL CLIENTE
                  flujoSalida.writeUTF("SaIudos al cliente del servidor");
                 
            }// Fin de for
           
           
            // CERRAR STREAMS Y SOCKETS
            flujoEntrada.close();
            flujoSalida.close();
            clienteConectado.close();
            servidorSSL.close();
           
      }// Fin de main
     
}// Fin de ServidorSSL