import java.net.Socket;
import java.net.ServerSocket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
public class MyServer{
	public static void main(String[] args){
		try{
			ServerSocket ss = new ServerSocket(9999);
			System.out.println("Waiting for client request.");
			Socket sock = ss.accept();
			System.out.println("Client connected.");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			String message;
			if((message=br.readLine())!=null){
				System.out.println("Received message from client.");
			}
			
		}catch(IOException e){
			System.out.println("Exception: "+e);
			
		}
		
	}
}