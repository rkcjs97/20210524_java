package ex08_inher;
//부모클래스
//사칙연산 계산
class Cal{
	private String color;
	//같은 패지지 클래스와 자식클래스에서 
	protected int result;
	
	//부모클래스의 생성자를 자식 클래스에서 실행
	Cal(String color){
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public int getResult() {
		return result;
	}

	int add(int a, int b) {
		return a+b;
	}
}
//자식클래스
//나머지, 제곱 추가
class NewCal extends Cal{
	private int result; //30
	NewCal(String color) {
		super(color); //부모클래스의 생성자를 실행
	}
	
	int add(int a) {
		// TODO Auto-generated method stub
		return result += a;
	}
	
	
	int remain(int a, int b) {
		return a%b;
	}
}

public class J20210503_02_Cal {
	public static void main(String[] args) {
		NewCal c1 = new NewCal("빨강");
		System.out.println(c1.getColor() +"계산기");
		System.out.println("더하기:" + c1.add(100, 50));
		System.out.println("나머지:" + c1.remain(10, 3));
		System.out.println(c1.add(10));
		System.out.println(c1.add(20));
		System.out.println(c1.getResult());
		
		//object의 메소드 사용 가능
		System.out.println(c1.hashCode());
	}

}
