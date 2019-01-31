package P03_Comunicaciones_en_red;

import java.io.IOException;
import java.io.InputStream;
//Librería de java para comunicación en red
import java.net.*;

public class EJ_01_Ejemplo_main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		InetAddress ip = null;
		//Le damos valor al objeto ip
		ip=InetAddress.getByName("127.0.0.1");
		System.out.println(ip);
		
		//Sacar la dirección ip y nombre de la máquina local
		//ip=InetAddress.getLocalHost();
		//System.out.println(ip);
		
		System.out.println("Dirección: "+ip.getHostAddress());
		System.out.println(""+ip.getHostName());
		System.out.println(ip.getCanonicalHostName());
		
		URL url = new URL("https://www.google.es:443");
		
		InputStream is = url.openStream();
		URLConnection con = url.openConnection();
		
	}
}
