package ex_class;

import java.util.Scanner;
	
public class J20210420_01_BankMain {
	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Bank b1 = null;
		int i =0;
		while(true){
			System.out.println("------------");
			System.out.println("1.계좌개설");
			System.out.println("2.입금");
			System.out.println("3.출금");
			System.out.println("4.잔액조회");
			System.out.println("0.종료");
			System.out.println("------------");
			
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			switch(n){
			case 1:
				System.out.println("------------");
				System.out.print("이름:");
				String bankname = sc.next();
				System.out.print("계좌번호:");
				String bankno = sc.next();
				b1 = new Bank(bankname, bankno);
				System.out.println("계좌개설이 완료되었습니다.");
				break;
			case 2:
				if(b1 == null) {
					System.out.println("계좌를 먼저 생성하세요.");
					continue;
				}
				else {
					System.out.println("입금하실 금액을 입력하세요:");
					int d = sc.nextInt();
					b1.deposit(d);
					System.out.println("입금이 완료되었습니다.");
					break;
				}
				
			case 3:
				if(b1 == null) {
					System.out.println("계좌를 먼저 생성하세요.");
					continue;
				}
				else {
					System.out.println("출금하실 금액을 입력하세요:");
					int w = sc.nextInt();
					b1.withdraw(w);
					if(w == -1) {
						System.out.println("잔액이 부족합니다.");
						break;
					}
					System.out.println("출금이 완료되었습니다.");
					break;
				}
			case 4:
				if(b1 == null) {
					System.out.println("계좌를 먼저 생성하세요.");
					continue;
				}
				else
					System.out.println("잔액:"+b1.getBalance()); break;
					
			case 0: System.out.println("종료되었습니다."); 
					System.exit(0);
			
			default: System.out.println("입력이 잘못되었습니다.");
			}
		
		

			
		}
			
		
		
			
		
	}	
	

}
