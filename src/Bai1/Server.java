package Bai1;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public Server() throws Exception{
		ServerSocket server = new ServerSocket(1834);
		Scanner sc = new Scanner(System.in);
		Socket socket = server.accept();
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		while(true) {
		
		
		
		String mes = in.readLine();
		System.out.println("nhu:" + mes);
		
		System.out.print("nhat:");
        String res = sc.nextLine();
		
        out.writeBytes(res+ "\n");
        
        
        
		}
	}
	public static void main(String[] args) throws Exception {
		new Server();
	}
	
}
