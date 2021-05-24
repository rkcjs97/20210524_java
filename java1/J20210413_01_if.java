package java1;

import java.util.Scanner;

public class J20210413_01_if {

	public static void main(String[] args) {
		//조건문 if
//		
//		int a=-1;  
//		
//		if(a>0) 
//			System.out.println("양수");
//		else if(a==0)
//			System.out.println("0");
//		else
//			System.out.println("음수");
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("두 수를 입력:");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		
//		if(a>b) {
//			System.out.println(a);
//			System.out.println("a가 더 큽니다.");
//		}
//		else {
//			System.out.println(b);
//			System.out.println("b가 더 큽니다.");
//		}
//		
		//점수를 입력받고 입력 받은 점수에 따라 등급을 출력하여 보시오
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수를 입력하세요:");
//		int p = sc.nextInt();
//		
//		if(p>89)
//			System.out.println("A등급 입니다.");
//		else if(p>79)
//			System.out.println("B등급 입니다.");
//		else if(p>69)
//			System.out.println("C등급 입니다.");
//		else if(p>59)
//			System.out.println("D등급 입니다.");
//		else
//			System.out.println("F등급 입니다.");
		
		//등수와 전체인원수를 입력받아 상위 15%는 A 35는 B 50은 C
//		Scanner sc = new Scanner(System.in);
//		System.out.println("전체인원:");
//		int p = sc.nextInt();
//		System.out.println("등수:");
//		int r = sc.nextInt();
//		
//		double per = (double)r/p * 100;
//		
//		if(per<16)
//			System.out.println("A");
//		else if(per<36)
//			System.out.println("B");
//		else if(per<51)
//			System.out.println("C");
//		else
//			System.out.println("F");
		
		//실습 섭씨<=>화씨 바꾸기
		// 섭씨 =  (화씨 - 32) x 5/9
		// 화씨 = 섭씨 * 9/5 + 32
//		Scanner sc = new Scanner(System. in);
//		System.out.print("온도를 입력하세요:");
//		double tem = sc.nextDouble();
//		String ch = sc.next();
//		
//		double C = (tem - 32) * 5 / 9;
//		double F = tem * 9 / 5 + 32;
//		
//		if(ch.equals("C")) 
//			System.out.printf("섭씨 %.1f는 화씨 %.1f입니다.",tem,F);
//		else if(ch.equals("F")) 
//			System.out.printf("화씨 %.1f는 섭씨 %.1f입니다.",tem,C);
//		else
//			System.out.println("다시 입력하세요");
		
		//십습) 입력값 계산기
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력:");
//		int a = sc.nextInt();
//		String s = sc.next();
//		int b = sc.nextInt();
//		
//		if()
//		
//		if(s.equals("+"))
//			System.out.printf("%d + %d = %d",a,b,a+b);
//		else if(s.equals("-"))
//			System.out.printf("%d - %d = %d",a,b,a-b);
//		else if(s.equals("*"))
//			System.out.printf("%d * %d = %d",a,b,a*b);
//		else if(s.equals("/"))
//			System.out.printf("%d / %d = %.2f",a,b,(double)a/b);
//		else 
//			System.out.println("다시 입력해주세요");
//		
		//아이디와 패스워드를 입력받아 로그인 성공여부를 결정짓는 프로그램
//		String myid = "java";
//		String mypw = "1234";
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("ID:");
//		String id = sc.next(); 
		
//		if (id.equals(myid)) {
//			System.out.print("PW:");
//			String pw = sc.next();
//			if(pw.equals(mypw))
//				System.out.printf("로그인 성공");
//			else
//				System.out.println("로그인 실패");
//		}
//		else 
//			System.out.println("로그인 실패");
			
		
		
		
		//이름/신장/몸무게를 입력받고 적정체중 여웁를 출력해주는 프로그램
		//평균체중 = (키-100)*0.9
		//오차범위= +-5%
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("이름/키/몸무게를 입력하세요:");
//		String n = sc.next();
//		int k = sc.nextInt();
//		int w = sc.nextInt();
//		
//		double aw = (k -100)*0.9;
//		double e = aw*0.05;
//		
//		if(aw+e <w)
//			System.out.println("과체중");
//		else if(aw-e>w)
//			System.out.println("저체중");
//		else
//			System.out.println("정상체중");
//		
				
		//전기 사용 요금
		// 200kwh이하 기본요금910 88.3원
		//201~400 기본요금 1600 182.9원
		//400 기본요금 7300 275.6원
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("전기사용량:");
//		double kwh=sc.nextDouble();
//		int basic=0;
//		double ch = 0;
//		
//		if(kwh<201) {
//			basic = 910;
//			ch = 88.3;
//			double fee = basic+(kwh*ch);
//			System.out.println(fee);
//		}
//		else if(kwh<400) {
//			basic = 1600;
//			ch = 182.9;
//			double fee = basic+(kwh*ch);
//			System.out.println(fee);
//			
//		}
//		else { 
//			basic = 7300;
//			ch = 275.6;
//			double fee = basic+(kwh*ch);
//			System.out.println(fee);
//		}
			
		//년을 입력받고 윤년체크
		//4로나눠 0이되면 윤년 1년중 100으로나누어지면 평년 2번에서 400으로 나눠
		//지는해는 윤년
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("입력:");
//		int y = sc.nextInt();
//		
//		if((double)y%4 == 0) {
//			if((double)y%100==0) {
//				if((double)y%400==0) {
//					System.out.println("윤년");
//				}
//				else
//					System.out.println("평년");
//				
//			}
//			else
//				System.out.println("윤년");
//		}
//		else
//			System.out.println("평년");
//			
		
		

	}

}
