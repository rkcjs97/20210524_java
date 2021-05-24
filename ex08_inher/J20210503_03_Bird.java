package ex08_inher;
//부모클래스
//final 클래스는 상속 불가
class Bird{
	private String name;
	Bird(String name){
		this.name = name;
	}
	
	void born() {
		System.out.println(name +" 알을 낳는다");
	}
	//final void fly() :final 메소드는 오보라이딩 불가
	void fly() {		
		System.out.println(name +" 날수 있다");
	}
}
//참새
class Sparrow extends Bird{
	Sparrow(String name) {
		super(name);//부모의 생성자를 실행
	}
	
}
//타조
class Ostrich extends Bird {
	Ostrich(String name) {
		super(name); //부모의 생성자를 실행
	}
	private String name ="타조";
	//오버라이딩:부모클래스의 메소드를 다시 정의
	@Override
	void fly() {
		System.out.println(name + " 날수 없다");
	}
}

public class J20210503_03_Bird {

	public static void main(String[] args) {
		Sparrow s1 = new Sparrow("참새");
		s1.born();
		s1.fly();
		System.out.println("--------------");
		Ostrich o1 = new Ostrich("타조");
		o1.born();
		o1.fly();
		
		
		Bird o2 = new Ostrich("타조"); //업캐스팅(자동)
		Ostrich o3 = (Ostrich)o2; //다운캐스팅(수동)
		o3.fly();
		
		

	}

}
