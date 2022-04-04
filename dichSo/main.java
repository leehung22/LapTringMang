package dichSo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import dichSo.Thread;

public class main {

	public static void main(String[] args)  throws IOException{
		// Mở cổng và bắt đầu nghe
				ServerSocket socketServer = new ServerSocket(9696);
				System.out.print("I'm waiting on 9696 port...");
				//
				int id=0;
				while(true) {
					Socket s = socketServer.accept();
					id++;
					new Thread(s, id++).start();
					
				}
	}
}
