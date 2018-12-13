package P03_Comunicaciones_en_red;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class EJ_02_2_Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		OutputStream os;
		try {
			//Creación del socket
			Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
			
			os = socket.getOutputStream();
			
			for(int i=0;i<=100; i++) {
				os.write(i);
			}		
			
		}catch(Exception e) {
			System.out.println("");
		}		
	}
}