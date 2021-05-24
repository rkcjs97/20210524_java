package ex14_file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

//서버 클래스
class Server{
	private int port = 33333;
	
	void start() {
		ServerSocket server = null;
		Socket socket = null;
		BufferedReader br = null;
		try {
			server = new ServerSocket(port);
			System.out.println("서버 시작");
			while(true) {
				System.out.println("클라이언트 접속 대기중...");
				socket = server.accept(); //클라이언트가 요청시 허용
				System.out.println("클라이언트 접속 성공");
				//데이터를 주고 받기 위한 스트림 생성
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				while(true) {
					String data = br.readLine();
					if(data == null||data.equals("quit")) break;
					System.out.println("받은 메세지:"+ br.readLine());
				}
			}
		}catch(SocketException e) {
			System.out.println("클라이언트 접속 종료");
		} catch (IOException e) {
			// TODO 자동 생성된 catch 블록
			System.out.println("io 예외");
			e.printStackTrace();
		}finally {
			try {
				if(br != null) br.close();
				if(socket!= null)socket.close();
				if(server != null)server.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
}

public class J20210510_02_network_sever {
	
	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}

}
