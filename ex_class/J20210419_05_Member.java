package ex_class;

//회원클래스
//필드: 아이디, 비밀번호, 생년월일,키(double)
class Member{
	//은닉화 : private
	private String id;
	private String pw;// 읽기 불가
	private int bd;
	private double t;
	//생성자: 객체가 생성될때 시행되는 메소드
	//반드시 객체가 생성될때 생성자가 실행이 되어야한다.
	//클래스의 이름과 같다
	//반환형이 없다.
	
	//기본생성자
	//만약에 생성자가 없으면 컴파일러가 기본생성자를 생성
	//생성자를 만들면 기본생성자를 생성하지 않음
	//생성자의 오버로딩
	Member(String id, String pw, int year, double t){
		this.id = id;
		this.pw = pw;
		this.bd = bd;
		this.t=t;
	}
	
	void setId(String id) {
		this.id = id;
	}
	
	void setPw(String pw) {
		this.pw = pw;
	}
	void setBd(int bd) {
		this.bd = bd;
	}
	void setT(double t) {
		this.t = t;
	}
	
	String getId() {
		return id;
	}
	int getBd() {
		return bd;
	}
	double getT() {
		return t;
	}
}

public class J20210419_05_Member {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Member M = new Member("Hobg","1234",19900101,170);
		M.setId("Hong");
		M.setPw("1234");
		M.setBd(19900101);
		M.setT(170);
		System.out.printf("ID:%s\nPW:****\nBirth:%d\nHeight:%.1f\n",
				M.getId(),M.getBd(),M.getT());
		
		System.out.println("0123456".substring(3));
		
		Member m2 = new Member("java","1111",1990110,171.1);

	}

}
