package ex06_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class J20210423_01_Exception {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//예외처리
//		Scanner sc = new Scanner(System.in);
//		int a=10, b=0;
//		
//		while(true) {
//			System.out.print("입력:");
//			try {//예외 발생 가능성이 있는 문장
//				b = sc.nextInt();
//				System.out.println(a/b);
//				break;
//			}
//			catch(ArithmeticException e) {
//				System.out.println("0로는 나눌수 없습니다.");
//				e.printStackTrace();//예외발생지점추적출력
//			}
//			catch(InputMismatchException e) {
//				//예외가 발생했을때 실행
//				System.out.println("숫자를 입력해주세요."); 
//				sc.nextLine();
//				e.printStackTrace();
//			}
//			catch(Exception e) {
//				System.out.println("예외 발생"); 
//				e.printStackTrace();
//			}
//			
//			
//		}
//		System.out.println("프로그램 정상 종료");
		
		//실습)정수를 입력받고 해당하는 index의 값 출력
//		int[] arr = {10,20,30};
//		
//	
//		try {
//			System.out.println("입력:");
//			int a = sc.nextInt();
//			System.out.println(arr[a-1]);
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("1~3사이의 수를 입력하세요.");
//		}
//		catch(InputMismatchException e) {
//			System.out.println("숫자를 입력해주세요.");
//		}
//		catch(Exception e) {
//			System.out.println("예외발생");
//			e.printStackTrace();
//		
		//예외의 종류 
		//1)체크예외 : RuntimeException을 상속하지않은 예외
		//네트워크나 db
		
		//2)언체크예외 : RuutimeException을 상속한 예외
		File file = new File("sample.txt");
		System.out.println(file);
		try {
			Scanner sc = new Scanner(file);
			System.out.println("파일을 불러옵니다.");
			while(sc.hasNextLine()) {
				String s = sc.nextLine();
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {//체크예외
			System.out.println("파일을 찾을 수 없습니다.");
			e.printStackTrace();
		} 
		}


}
