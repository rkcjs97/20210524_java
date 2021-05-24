package java1;

import java.util.Scanner;

public class J20210412_04_Scanner {
	public static void main(String[] args) {
		//사용자에게 입력받기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수:");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		
//		System.out.println(a);
//		System.out.println(b);
//		
		//반지름을 입력받아 원의 넓이 구하기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("반지름:");
//		Double a = sc.nextDouble();
//		//Math.PI : 원주율
//		System.out.println(a*a*Math.PI);
		
		//문자열을 입력받을때
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름:");
//		String name = sc.next();
//		System.out.println(name);
		
		//한줄을 읽어들이는 메소드(엔터를 기준으로 읽기)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름:");
//		String s = sc.nextLine();
//		System.out.println(s);
//		
		//실습)나이와 이메일 이름을 입력받아 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이:");
//		int age = sc.nextInt();
//		System.out.print("이메일:");
//		String mail = sc.next();
//		sc.nextLine();//엔터처리(버퍼비우기)
//		System.out.print("이름:");
//		String name = sc.nextLine();
//		System.out.printf("나이: %d, 이메일: %s, 이름: %s", age, mail, name);
//		
		//실습)반, 이름, 파이썬,c,java 점수를 입력받아
		//반, 이름 총점과 평균을 구하여 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("반:");
		int c = sc.nextInt();
		System.out.print("이름:");
		String n = sc.next();
		System.out.print("파이썬:");
		int p = sc.nextInt();
		System.out.print("C:");
		int C = sc.nextInt();
		System.out.print("Java:");
		int J = sc.nextInt();
		int sum = p+C+J;
		System.out.printf("%d반 %s의 총점:%d 평군:%.2f",c,n,sum,(double)sum/3);
		
	}
	
	

}
