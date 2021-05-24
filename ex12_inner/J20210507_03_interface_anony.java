package ex12_inner;
//인터페이스 객체 생성 안됨
interface School{
	void namePrint();
}
class HighSchool implements School{
	
	@Override
	public void namePrint() {
		
	}
}

public class J20210507_03_interface_anony {
	
	public static void main(String[] args) {
		new HighSchool();	
		
		
		School high = new School() {
			//익명클래스 생성
			@Override
			public void namePrint() {
				// TODO 자동 생성된 메소드 스텁
				System.out.println("국제 고등학교");
			}
		};
		
		high.namePrint();

	}

}
