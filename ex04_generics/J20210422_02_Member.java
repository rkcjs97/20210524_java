package ex04_generics;

//멤버클래스
//필드 :아이디, 패스워드
class Member{
	private String userid;
	private String passwd;
	
	public Member(String userid, String passwd) {
		super();
		this.userid = userid;
		this.passwd = passwd;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@Override
	public String toString() {
		return "Member [userid=" + userid + ", passwd=" + passwd + "]";
	}
		
}

//Vip
//필드: 아이디(userid),비밀번호(),할인율(rate)
class Vip{
	private String userid;
	private String userpw;
	private double rate;
	
	public Vip(String userid, String userpw, double rate) {
		super();
		this.userid = userid;
		this.userpw = userpw;
		this.rate = rate;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpw() {
		return userpw;
	}

	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Vip [userid=" + userid + ", userpw=" + userpw + ", rate=" + rate + "]";
	}
}

//로그인 관리 클래스
class LoginManager<T>{
	//로그인 메소스
	void login(T member) {
		System.out.println(member);
		if(member instanceof Member) {
			System.out.println(((Member)member).getUserid()+"님 로그인");
		}else if(member instanceof Vip) {
			System.out.println(((Vip)member).getUserid()+"님 로그인");
		}
	}
}
public class J20210422_02_Member {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Member m1 = new Member("java","1111");
		System.out.println(m1);
		
		Vip v1 = new Vip("hong","2222",0.1);
		System.out.println(v1);
		
		LoginManager<Member> l1 = new LoginManager<>();
		l1.login(m1);
		LoginManager<Vip> l2 = new LoginManager<>();
		l2.login(v1);
	}

}
