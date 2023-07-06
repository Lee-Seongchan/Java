package sub3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ThreadSender extends Thread{
	
	private Socket socket;
	
	public ThreadSender(Socket socket) {
		this.socket = socket;
	}
	
	
	@Override
	public void run() {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			PrintWriter write = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				
				String msg = br.readLine();
				
				if(msg.equals("bye")) {
					break;
				}
				
				write.println("송신 > " + msg);
				write.flush();
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
}
