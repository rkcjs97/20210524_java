package ex14_file;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

class Client{
	private String ip = "127.0.0.1";
	private int port = 33333;
	void start() {
		Scanner sc = new Scanner(System.in);
		Socket socket = null;
		PrintWriter pw = null;
		//클라이언트에서 서버의 ip, port필요
		try {
			socket = new Socket(ip,port);
			System.out.println("클라이언트 서버에 접속");
			pw = new PrintWriter(socket.getOutputStream(), true);
			while(true) {
				System.out.print("보낼메세지:");
				pw.println(sc.nextLine());
			
			}
		} catch (IOException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}finally {
				try {
					if(pw != null) pw.close();
					if(socket != null) socket.close();
				} catch (IOException e) {
					// TODO 자동 생성된 catch 블록
					e.printStackTrace();
				}
		}
		
		
	}
}

public class J20210510_03_network_client {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		 Client client = new Client();
		 client.start();
	}

}
