package P03_Comunicaciones_en_red;

import java.io.IOException;

public class EJ_04_3_Emisor_main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		EJ_04_1_MulticastEmisor emisor = new EJ_04_1_MulticastEmisor();		
		emisor.multicast("Halaaaaa Madriddd");		
	}
}