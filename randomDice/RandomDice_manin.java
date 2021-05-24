package randomDice;

import java.util.Random;
import java.util.Scanner;



	
	



public class RandomDice_manin {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		boolean logincheck = false;
		String loginid = "Guest";
		LoginDAO ldao = new LoginDAO();
		Random ran = new Random();
		int pldice = 0;
		int aidice = 0;
		while(true) {
			System.out.println("-------------------");
			System.out.println("----Random Dice----");
			System.out.println("-------------------");
			System.out.println("ID:"+loginid);
			System.out.println("0.Join");
			System.out.println("1.Login");
			System.out.println("2.Throwing a Dice");
			System.out.println("3.Record");
			System.out.println("9.End");
			System.out.println("-------------------");
			Scanner sc = new Scanner(System.in);
			
			int num = sc.nextInt();
			
			//회원가입
			if(num == 0) {
				System.out.print("New ID:");
				String id = sc.next();
				System.out.print("New PW:");
				String pw = sc.next();
				LoginDTO ldto = new LoginDTO(id,pw);
				ldao.join(ldto);
			}
			//로그인
			else if(num == 1) {
				System.out.print("ID:");
				String id = sc.next();
				LoginDTO ldto = ldao.login(id);
				if(ldto==null) {
					System.out.println("ID invalid");
					logincheck = false;
					loginid = "Guest";
				}
				else {
					System.out.print("PW:");
					String pw = sc.next();
					if(ldto.getPw().equals(pw)) {
						System.out.println("Login succes");
						logincheck = true;
						loginid = id;
					}
					else {
						System.out.println("PW invalid");
						logincheck = false;
						loginid = "Guest";
					}
					
				}
			}
			//주사위 던지기
			else if(num == 2) {
				System.out.println("Throw the dice...");
				
				for(int i=3;i>0;i--) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO 자동 생성된 catch 블록
						e.printStackTrace();
					}
					System.out.println(i+"..");
				}
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e2) {
					// TODO 자동 생성된 catch 블록
					e2.printStackTrace();
				}
				
				int randice = ran.nextInt(6)+1;
				pldice = randice;
				System.out.println("number:"+randice);
				
				System.out.println("-------------------");
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
					// TODO 자동 생성된 catch 블록
					e1.printStackTrace();
				}
				
				System.out.println("AI Throw the dice...");
				
				for(int i=3;i>0;i--) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO 자동 생성된 catch 블록
						e.printStackTrace();
					}
					System.out.println(i+"..");
				}
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO 자동 생성된 catch 블록
					e.printStackTrace();
				}
				
				randice = ran.nextInt(6)+1;
				aidice = randice;
				System.out.println("number:" + aidice);
				
				if(pldice < aidice) {
					System.out.println("-------------------");
					System.out.println("AI Win!");
					System.out.println("-------------------");
				}
				else if(pldice > aidice){
					System.out.println("-------------------");
					System.out.println("Player Win!");
					System.out.println("-------------------");
				}
				else {
					System.out.println("-------------------");
					System.out.println("Draw");
					System.out.println("-------------------");
				}
				
				System.out.println("continue?(y/n)");
				String cn = sc.next();
				
				if(cn.equals("y")) {
					continue;
				}
				else if(cn.equals("n")) {
					System.out.println("Go to the main menu.");
				}
			
				
			}
			else if(num == 3) {
				
			}
			//종료
			else if(num ==9) {
				System.out.print("The End...");
				break;
			}
			else {
				System.out.println("Input is invalid.");
			}
		}

	}

}
