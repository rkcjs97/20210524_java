package ex12_inner;
interface Cal{
	int add(int a, int b);
//	int sub(int a, int b);
}

public class J20210507_05__Cal {

	public static void main(String[] args) {
		// 익명클래스
		Cal cal = new Cal() {
			
//			@Override
//			public int sub(int a, int b) {
//				// TODO 자동 생성된 메소드 스텁
//				return a-b;
//			}
			
			@Override
			public int add(int a, int b) {
				// TODO 자동 생성된 메소드 스텁
				return a+b;
			}
		};
		
		System.out.println(cal.add(1, 1));
//		System.out.println(cal.sub(1, 1));
		
		//람다식
		//한개의 추상메소드만 가지고 있어야 한다.(함수적 인터페이스)
		Cal cal2 = (a,b)->a+b; //람다식
		System.out.println(cal2.add(10, 20));
	}

}
