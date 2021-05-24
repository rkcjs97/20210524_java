package ex_class;

public class J20210421_03_Cal {
	private static final String maker ="국제 계산기";
	private int result;
	private boolean light;
	
	public static String getMaker() {
		return "[" + maker + "]";
	}
	//두수를 매개변수로 받아서 합을 리턴하는 메소드
	//static 메소드 안에서는 static필드만 사용 가능
	static int add(int a, int b) {
		return a+b;
	}
	int add(int a) {
		this.result += a;
		return result;
	}
	
	//라이트켜기/끄기
	void lightToggle() {
		light = !light;
	}
	
	public static void main(String[] args) {
	
		System.out.println(J20210421_03_Cal.getMaker());
		System.out.println(J20210421_03_Cal.add(20, 10));
		
		J20210421_03_Cal cal = new J20210421_03_Cal();
		System.out.println(cal.add(20, 10));
		cal.lightToggle();
		
		
	}

}
