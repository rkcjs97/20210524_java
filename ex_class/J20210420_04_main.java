package ex_class;

import java.util.Scanner;

public class J20210420_04_main {
	
	public static void main(String[] args) {
//		System.out.println(args.length);
//		for(String s:args) {
//			System.out.println(s);
//		}
		
		//실습)ID와 PW를 args로 받아서 
		//ID가 java이고 PW가 1111이면 관리자모드, 아니면 사용자모드 출력
		if(args.length>1 && args[0].equals("java") && args[1].equals("1111")) 
			System.out.println("관리자모드");
		else
			System.out.println("사용자모드");
			
		//반지름과 원주율을 입력받아 원의 넓이를 구하는 메소드(단, 반지름은 정수
		//또는 
		
	
	}

}
