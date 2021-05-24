package ex12_inner;

import ex12_inner.OuterClass.InnerClassNew;

class OuterClass{
	class InnerClass{
		public String toString() {
			return "인스턴스 클래스";
		}
	}
	InnerClass inner = new InnerClass();
	
	void method1() {
		InnerClass localInner = new InnerClass();
		System.out.println(localInner);
	}
	class InnerClassNew{
		public String toString() {
			return "새로운 인스턴스 클래스";
		}
	}
}

public class J20210507_01_inner {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		OuterClass outer = new OuterClass();
		System.out.println(outer.inner);
		outer.method1();
		
		//inner클래스 생성
		InnerClassNew innerNew = outer.new InnerClassNew();

	}

}
