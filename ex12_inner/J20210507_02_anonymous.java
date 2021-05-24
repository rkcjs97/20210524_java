package ex12_inner;

class Dog{
	
	void walking() {
		System.out.println("걸을 수 있다.");
	}
}

//class HuntDog extends Dog{
//	
//	@Override
//	void walking() {
//		
//	}
//	
//}

public class J20210507_02_anonymous {
	
	public static void main(String[] args) {
//		HuntDog hdog = new HuntDog();
//		hdog.walking();
		//익명 클래스: 부모의 클래스로 재정의 해서 생성
		//1회성으로 쓰려고 할때
		Dog hdog = new Dog() {
			@Override
			void walking() {
				System.out.println("걸을 수 없다.");
			}
			//오버라이딩만 의미가 있다: 실행불가
//			void eating() {
//				System.out.println("먹는다");
//			}
		};
		hdog.walking();
	}

}
