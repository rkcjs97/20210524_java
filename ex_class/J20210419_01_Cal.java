package ex_class;

//계산기
class Cal{
	//속성:필드
	String maker = "계산기";
	//기능
	int add(int a, int b) {//더하기
		return a+b;
	}
	int sub(int a, int b) {
		return a-b;
	}
	int mul(int a,int b) {
		return a*b;
	}
	double div(int a, int b) {
		return (double)a/b; 
	}
}
public class J20210419_01_Cal {
	public static void main(String[] args) {
		Cal c1 = new Cal();
		System.out.println("덧셈:"+c1.add(1,3));
		System.out.println("뺄셈:"+c1.sub(3,1));
		System.out.println("곱셈:"+c1.mul(3,1));
		System.out.println("나눗셈"+c1.div(3,1));
		
	}

}
