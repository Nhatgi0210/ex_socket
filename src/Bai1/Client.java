package Bai1;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public Client() throws Exception{
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("192.168.2.2", 1834);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		while (true) {
			System.out.print("nhu: ");
			String mes = sc.nextLine();
			
			out.writeBytes(mes+"\n");		
			String a = in.readLine();
			System.out.println("nhat:"+ a);
		
		}
	}
	public static void main(String[] args) throws Exception {
		 new Client();
	}
}
