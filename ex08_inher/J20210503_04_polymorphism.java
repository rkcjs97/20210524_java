package ex08_inher;
//부모클래스
class Shape{
	//다형성을 위해서 메소드 작성
	void printShape() {
		//System.out.println("다각형");
	}
}
//사각형 클래스
class Rect extends Shape{
	@Override
	void printShape() {
		System.out.println("사각형");
	}
	
}

//삼각형 클래스
class Tria extends Shape{
	@Override
	void printShape() {
		System.out.println("삼각형");
	}
}

public class J20210503_04_polymorphism {
	public static void main(String[] args) {
		//다형성을 이용해서 메소드를 실행 하려면 오버라이딩이 되어 있어야 한다.
		//runtime시에는 자식메소들 실행
		Shape rec = new Rect();
		rec.printShape(); //컴파일 에러
		Shape tri = new Tria();
		tri.printShape();
		
		
	}

}
