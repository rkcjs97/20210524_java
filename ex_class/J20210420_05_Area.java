package ex_class;

import java.util.Scanner;

//반지름과 원주율을 입력받아 원의 넓이를 구하는 메소드(단, 반지름은 정수
//또는 실수형일 수 있다.
//원클래스
class Circle{
	private double radius;
	private double area;
	
	//생성자
	public Circle(double raidus) {
		super();
		this.radius = raidus;
		circleArea(radius);
	}
	
	//get set
	public double getRaidus() {
		return radius;
	}
	public void setRaidus(double raidus) {
		this.radius = raidus;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	//메소드
	double circleArea(double radius) {
		return area = radius*radius*3.14;
	}
	double circleArea(int radius) {
		return area = radius*radius*3.14;
	}

	@Override
	public String toString() {
		return "Circle [ raidus=" + radius + ", area=" + area + "]";
	}
	
	
	
}
public class J20210420_05_Area {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in); 
		int r = sc.nextInt();
		Circle circle = new Circle(r);
		Circle circle1 = new Circle(3.5);
		System.out.println(circle);
		System.out.println(circle1);
		
		

	}

}
