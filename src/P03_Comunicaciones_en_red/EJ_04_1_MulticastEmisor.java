package P03_Comunicaciones_en_red;

import java.io.IOException;
import java.net.*;

public class EJ_04_1_MulticastEmisor {
    private DatagramSocket socket;
    private InetAddress grupo;
    private byte[] buf;
 
    public EJ_04_1_MulticastEmisor() {}
    
    public void multicast(String multicastMessage) 
    		throws IOException {
        socket = new DatagramSocket();
        grupo = InetAddress.getByName("225.26.38.10");
        buf = multicastMessage.getBytes();
 
        DatagramPacket informacion = new DatagramPacket(buf, buf.length, grupo, 9999);
        socket.send(informacion);
        socket.close();
    }
}
