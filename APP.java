import solicitante.Solicitante;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
/*Essa classe vai ser a responsável por executar as funções mais importantes
 * do projeto, dessa forma, executando as classes criadas
 */

public class APP {
	
	public static void main (String args[]) {
		Solicitante sl = new Solicitante("123456","maxusel","medeiros","1234","10:40:00","12:20:00","ramoIEEE");
		  InetAddress ia;
		  int port = 5000;
		  try {

	             ia = InetAddress.getByName("localhost");
	         
	             Socket sock = new Socket(ia,port);
	             
	             System.out.println("Conetado ao servidor de chaves");

	             DataInputStream in = new DataInputStream(sock.getInputStream());
	             DataOutputStream out = new DataOutputStream(sock.getOutputStream());
	             
	             out.writeUTF(sl.getSenhaAcesso());
	             String msg_in1 = in.readUTF();
	             if(msg_in1.equals("FECHADO")) {
	            	 System.out.println("Esta aberto para acesso a chave!");
	             }else {
	            	 System.out.println("A liberação não foi feita!");
	             }


	        } catch (UnknownHostException ex) {
	            System.out.println(ex.getMessage());
	        } catch (IOException ex) {
	            System.out.println(ex.getMessage());
			}
	}

	

}
