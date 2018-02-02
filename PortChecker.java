import java.io.IOException;
import java.net.*;
import java.util.Scanner;


public class PortChecker{
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
        System.out.print("Enter host name: ");
		String host = kbd.nextLine();

		for(int port = 1; port <= 1024; port++){
		  try{
		     Socket socket = new Socket(host,port);
			 socket.close();
			 System.out.println(host +":" + port + " is open");
		  } catch(Exception io){
             System.out.println("Error Connection!");
		  }
		
		}
	}
}