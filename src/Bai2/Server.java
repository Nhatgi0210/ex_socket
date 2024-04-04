package Bai2;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Server {
	public Server() throws IOException {
		ServerSocket server = new ServerSocket(1234);
		Socket socket = server.accept();
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		while(true) {
			String mes = in.readLine();
			if(mes.equals("time")) {		
				SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
				String time = dateFormat.format(new Date());
				out.writeBytes(time+"\n");
			
			}
			else {
				out.writeBytes("no\n");
			}
		}
	}
	public static void main(String[] args) throws IOException {
		new Server();
	}
}
