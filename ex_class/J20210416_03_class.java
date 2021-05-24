package ex_class;
//객체를 만들어내기 위한 틀
class Dog{
	//속성:필드
	//자동초기화
	String type = "강아지";
	String name = "멍멍이";
	int leg = 4;
	int cnt;//걸음수
	//기능:메소드
	void walking() {
		cnt++;
		System.out.println(name+"걷는다.");
	}
	//개똥이 먹는다 출력
	void eating() {
		System.out.println(name+"먹는다.");
	}
}
public class J20210416_03_class {
	
	public static void main(String[] args) {
		//클래스
		Dog d1 = new Dog();
		System.out.println(d1.type);
		System.out.println(d1.leg);
		d1.walking();
		System.out.println(d1.cnt);
		d1.eating();
		
		
	}


}
