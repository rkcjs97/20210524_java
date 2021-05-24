package ex06_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J20210423_02_throws {
	
	static void arrayIndex(int index) {
		int[] arr = {10,20,30};
		
		try {
			System.out.println(arr[index-1]);
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("1~3사이의 숫자를 입력하세요.");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("예외발생");
		}
		
	}
	
	static void arrayIndex_throws(int index) throws ArrayIndexOutOfBoundsException {
		int[] arr = {10,20,30};
		System.out.println(arr[index]-1);
	}
	
	//예외던지기: 체크예외
	static void fileRead(String filename) throws FileNotFoundException {
		
		File file = new File("sample.txt");
		System.out.println(file);
		
	
			Scanner sc = new Scanner(file);
			System.out.println("파일을 불러옵니다.");
			while(sc.hasNextLine()) {
				String s = sc.nextLine();
				System.out.println(s);
		}
	
		
	}
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		//throws:예외던지기
		J20210423_02_throws.arrayIndex(3);
		
		//던진 예외 처리
//		try {
//			J20210423_02_throws.arrayIndex_throws(4);;
//		
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("1~3사이의 숫자를 입력하세요.");
//			e.printStackTrace();
//		}
//		catch(Exception e) {
//			System.out.println("예외발생");
//		}
		
		//파일읽기 메소드 호출
		try {
			J20210423_02_throws.fileRead("sample.txt");
		}catch(FileNotFoundException e){
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
		}
		

	}
		

}
