package ex08_inher;
//동물
class Animal{
}

//토끼
class Rabbit extends Animal{
	@Override
	public String toString() {
		return "토끼";
	}
}

//사자
class Lion extends Animal{
	@Override
	public String toString() {
		return "사자";
	}
}

class AnimalCare{
	//먹이주기 메소드
	void eating(Animal ani) {
		System.out.println(ani + " 먹이주기");
	}
	//목욕시키기 메소드
	void washing(Animal ani) {
		System.out.println(ani + " 목욕하기");
	}
	
}

public class J20210504_03_Animal {
	public static void main(String[] args) {
		//객체생성
		AnimalCare ac = new AnimalCare();
		Rabbit rabbit = new Rabbit();
		Lion lion = new Lion();
		//메소드 실행
		ac.eating(rabbit);
		ac.eating(lion);
		ac.washing(rabbit);
		ac.washing(lion);
		

	}

}
