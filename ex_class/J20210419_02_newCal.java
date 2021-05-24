package ex_class;
//결과값이 저장되는 계산기
class newCal{
	//필드:maker, result(결과값)
	String maker = "새로운 계산기";
	double result;
	//메소드:결과값에 더하느기능;
	//오버로딩: 메소드의 갯수나 형이 다른 경우 메소드의 이름 중복 가능
	void add(double a) {
		result = result+a;
	}
	double add(double a, double b) {
		return a+b;
	}
	void add(int a) {
		result += a;
	}
	void sub(double a) {
		result = result-a;
	}
	void mul(double a) {
		result = result*a;
	}
	void div(double a) {
		result = result/a;
	}
}

public class J20210419_02_newCal {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		newCal cal = new newCal();
		System.out.println(cal.result);
		cal.add(10);
		System.out.println(cal.result);
		cal.sub(1);
		System.out.println(cal.result);	
		cal.mul(10);
		System.out.println(cal.result);
		cal.div(10);
		System.out.println(cal.result);
		System.out.println(cal.add(20, 10));

	}

}
