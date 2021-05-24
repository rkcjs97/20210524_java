package ex04_generics;

//사각클래스
//필드: 가로,세로,넓이
 class Quad<T>{
	private T width;
	private T height;
	private double area;

	public Quad(T width, T height) {
		super();
		this.width = width;
		this.height = height;
		area = getArea(width,height);//넓이 계산
	}
	
	//get,set
	public T getWidth() {
		return width;
	}
	public void setWidth(T width) {
		this.width = width;
	}
	public T getHeight() {
		return height;
	}
	public void setHeight(T height) {
		this.height = height;
	}
	public double getArea(T width, T height) {
		return area;
	}
	
	@Override
	public String toString() {
		return "quad [width=" + width + ", height=" + height + ", area=" + area + "]";
	}
	
	
}

public class J20210422_01_generics {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Quad quad = new Quad(4,4);
		System.out.println(quad.getArea(4,4));

	}

}
