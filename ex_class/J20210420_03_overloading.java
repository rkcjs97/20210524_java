package ex_class;

import java.util.Arrays;

class Sum{
	//두 정수를 매개변수로 받아서 합을 리턴하는 메소드
	int sum2(int a, int b) {
		return a+b;
	}
	
	//세 정수를 매개변수로 받아서 합을 리턴하는 메소드
	int sum3(int a, int b, int c) {
		return a+b+c;
	}
	//배열을 매개변수로 받아서 합을 리턴하는 메소드
	int add(int[] arr) {
		int sum = 0;
		for(int i=0;i<arr.length-1;i++) {
			sum +=arr[i];
		}
		arr[arr.length-1] = sum;
		return sum;
	}
	//가변인자
	int add1(int... arr) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum +=arr[i];
		}
		return sum;
	}
	
	//문자열을 가변인자로 받아서 출력
	void str(String...strigs) {
		for(int i=0;i<strigs.length;i++) {
			System.out.println(strigs[i]);
		}
	}
	
}
public class J20210420_03_overloading {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Sum s =new Sum();
		System.out.println(s.sum2(50,60));
		System.out.println(s.sum3(10,20,30));
		
		int[] arr = {10,20,30,40,0};
		System.out.println(s.add(arr));
		System.out.println(Arrays.toString(arr));
		
		s.add1(10,20,30,40);
		
		s.str("가","나","다");
	}

}
