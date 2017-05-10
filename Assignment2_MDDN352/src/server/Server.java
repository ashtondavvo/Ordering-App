package server;

import java.io.IOException;
import java.net.*;
import java.io.*;

public class Server {
	
	private ServerSocket server;
	private Socket socket;
	private DataOutputStream dos;
	private DataInputStream dis;
	private BufferedReader br;
	private Thread thread;
	
	public Server(){
		try {
			server = new ServerSocket(3000);
			System.out.println("Waiting for connection on port 3000");
			socket = server.accept();
			System.out.println("Client Connected");
			dos = new DataOutputStream(socket.getOutputStream());
			dis = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			System.out.println("There was a problem setting up the connection");
			e.printStackTrace();
		}
		
	}

	public void readConnection() {
		//thread = new Thread();
		//thread.start();
		//while(true){
			try {
				System.out.println(dis.readUTF());
			} catch (IOException e) {
				System.out.println("Could not read from Client");
				e.printStackTrace();
			}
		//}
		
	}
	
	
//	public static void main(String arg[]){
//		try {
//			ServerSocket server = new ServerSocket(3000);
//			Socket s = server.accept();
//			System.out.println("Connected");
//		} catch (IOException e) {
//			System.out.println("There was a problem in creating a ServerSocket on the port 3000");
//			e.printStackTrace();
//		}
//	}
	
}
