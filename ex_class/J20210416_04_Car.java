package ex_class;

import java.util.Scanner;

//자동차 클래스
//속성: name, color, power, speed
//기능:powerToggle, speedToggle
class Car{
	String name = "아이오닉5";
	String color = "siver";
	boolean power;
	int speed ;
	Scanner sc = new Scanner(System.in);
	String updown;
	
	void powerToggle() {
		power = !power;
	}
	
	void speedUp() {
		speed++;
	}
	void speedDown() {
		speed--;
	}
	
}

public class J20210416_04_Car {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Car car = new Car();
		
		System.out.println(car.name);
		System.out.println(car.color);
		System.out.println(car.power);
		car.powerToggle();
		System.out.println(car.power);
		System.out.println("속도:");
		Scanner sc = new Scanner(System.in);
		String speed = sc.next();
		if(speed.equals("up"))
		for(int i=0;i<100;i++){
			car.speedUp();
		}
		System.out.printf("속도: %d",car.speed);
		

	}

}
