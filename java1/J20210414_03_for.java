package java1;

import java.util.Scanner;

public class J20210414_03_for {

	public static void main(String[] args) {
		// for
//		int a = 0;
//		
//		for(int i = 1;i<11;i++) {
//			a= a+i;
//		}
//		System.out.println(a);
//		
		//실습
/*		double r = Math.random();
		//r * (end - start +1)+start
		int random = (int)(r*(100-1+1)+1);
		
		System.out.println(random);
		
		
		Scanner sc = new Scanner(System.in);
		*/
//		for(int i = 0;i<5;i++) {
//			
//			System.out.print("수를 맞추어보세요:");
//			
//			int n = sc.nextInt();
//			if(n==random) {
//				System.out.println("정답입니다.");
//				break;
//			}
//			else if(n<random)
//				System.out.println("UP");
//			else if (n>random)
//				System.out.println("Down");
//		}
		
		
//		int i = 0;
//		
//
//		while(i<5) {
//				
//			i++;
//			System.out.print("수를 맞추어보세요:");
//			
//			int n = sc.nextInt();
//			
//			if(n==random) {
//				System.out.println("정답입니다.");
//				break;
//			}
//			else if(n<random)
//				System.out.println("UP");
//			else if (n>random)
//				System.out.println("Down");
//			
//			if(i==5 && n!=random) {
//				System.out.println("게임오버");
//			}
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("설탕을 주문하세요:");
//		int N = sc.nextInt();
//	
//		int i = 0;
//		while(N>0) {
//			if(N%5==0){
//				N = N/5;
//				i = N;
//				break;
//			}
//			else if(N%3==0) {
//				N = N/3;
//				i = i+N;
//				break;
//			}
//			else
//				N = N-5;
//			i++;
//	
//		}
//		if(N<0) {
//			i = -1;
//		}
//		System.out.println(i);
	
		
		
		//소수 구하기
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		boolean b = true;//소수여부
//		
//		for(int i = 2; i < 10; i++) {
//			if(n%i == 0) {
//				System.out.println("소수가 아닙니다.");
//				b=false;
//				break;
//			}		
//		}
//		if(b)
//			System.out.println("소수입니다.");
		
		//1부터 N사이의 소수
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		for(int i = 2; i < n ; i++) {
			boolean b = true;
			for(int j = 2; j<i; j++){
				if(i%j == 0) {
				b=false;
				break;
				}
			}
			
			if(b){
				System.out.println(i);
			}
		
		}
	}
}
