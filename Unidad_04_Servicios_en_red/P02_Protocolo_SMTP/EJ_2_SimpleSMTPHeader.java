package P02_Protocolo_SMTP;

import java.io.IOException;
import java.io.Writer;

import org.apache.commons.net.smtp.SMTPClient;
import org.apache.commons.net.smtp.SMTPReply;
import org.apache.commons.net.smtp.SimpleSMTPHeader;

public class EJ_2_SimpleSMTPHeader {

	public static void main(String[] args) {
		
		SMTPClient client= new SMTPClient();
		 try {
		      int respuesta;
		      client.connect("localhost");
		      System.out.print(client.getReplyString());
		      respuesta = client.getReplyCode();

		      if(!SMTPReply.isPositiveCompletion(respuesta)) {
		        client.disconnect();
		        System.err.println("SMTP server refused connection.");
		        System.exit(1);
		      }
		      
		      client.login();
		    
		      String remitente ="jorge.chueca.guerra@iestubalcain.net";
		      String destino1="jorge.chueca.guerra@iestubalcain.net";
		      String destino2="jorgechue10@gmail.com";		      
		      String asunto="Prueba de SMTPClient usando SimpleSMTPHeader";
		      String mensaje = "Hola. \nEnviando saludos.\nChao.";
		      
		      //se crea la cabecera
		      SimpleSMTPHeader cabecera = new SimpleSMTPHeader
		    		  (remitente , destino1, asunto);		      
		      cabecera.addCC(destino2);
		      
		      //establecer el correo de origen
		      client.setSender(remitente);
		      
		      //añadir correos destino 
		      client.addRecipient(destino1);//hay que añadir los dos
		      client.addRecipient(destino2);
		     
		      //se envia DATA
		      Writer writer = client.sendMessageData();   
		      if(writer == null) { //fallo	       
		    	  System.out.println("FALLO AL ENVIAR DATA.");			     
			      System.exit(1);
		      }
		      
		      System.out.println(cabecera.toString());
		      writer.write(cabecera.toString()); //primero escribo cabecera    
	          writer.write(mensaje);//luego mensaje
	          writer.close();
	          
	       	  if(!client.completePendingCommand())  { //fallo
	       		  System.out.println("FALLO AL FINALIZAR LA TRANSACCIÓN.");			     
			      System.exit(1);
		      }
		      
	       	  client.logout(); 
	          client.disconnect();
	          
		 } catch (IOException e) {
			 System.err.println("NO SE PUEDE CONECTAR AL SERVIDOR.");
			 e.printStackTrace();
			 System.exit(2);
		 }		    
		 System.exit(0);		
	}
}