package P03_Comunicaciones_en_red;

import java.io.IOException;
import java.net.*;

//Cliente que escucha hasta que llega la cadena fin.
public class EJ_04_2_MulticastReceptor extends Thread {
	
	 protected MulticastSocket socket = null;
	 protected byte[] buf = new byte[256];
	 
	 public EJ_04_2_MulticastReceptor() {
		
	 }
	 
	 public void run() {
	     
	     try {
			socket = new MulticastSocket(9999);
			InetAddress grupoMulticast = InetAddress.getByName("225.26.38.12");
		    socket.joinGroup(grupoMulticast);
		     
		    while (true) {
		         
		        DatagramPacket informacion = new DatagramPacket(buf, buf.length);
		        socket.receive(informacion);
		        String recibido = new String(informacion.getData(), 0, informacion.getLength());
		        System.out.println(recibido);
		        
		        if ("fin".equals(recibido)) {
		            break;
		        }
		    }
		    socket.leaveGroup(grupoMulticast);
		    socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	     
	 }
}