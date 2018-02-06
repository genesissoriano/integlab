import java.net.Socket;
import java.net.UnknownHostException;
import java.net.InetAddress;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
public class MyClient{
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			try{
				InetAddress localhost = InetAddress.getLocalHost();
				Socket sock = new Socket(localhost,9999);
				
				System.out.print("Enter a message: ");
				String message = sc.nextLine();
				
				OutputStreamWriter osw = new OutputStreamWriter(sock.getOutputStream());
				PrintWriter pw = new PrintWriter(osw);
				pw.println(message);
				pw.flush();
				
			}catch(UnknownHostException e){
				System.out.println("Can't connect.");
			}catch(IOException ex){
				System.out.println("Exception: " + ex );
			}
	}
}