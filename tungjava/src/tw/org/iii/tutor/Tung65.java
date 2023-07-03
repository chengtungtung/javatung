package tw.org.iii.tutor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Tung65 {

	public static void main(String[] args) {
		// TCP用戶端
		String mesg = "Test By TCP";
		try {
			Socket socket = new Socket(InetAddress.getByName("10.0.101.93"),9999); // 可填0~65535，但0~1024盡量不使用，因為有特殊用途
			
			File source = new File("dir1/coffee.jpg");
			FileInputStream fin = new FileInputStream(source);
			byte[] buf = new byte[(int)source.length()];
			fin.read(buf);
			fin.close();
			
			OutputStream out = socket.getOutputStream();
			//out.write(mesg.getBytes());
			out.write(buf);
			out.flush();
			out.close();
			
			socket.close();
			System.out.println("Client Ok");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
