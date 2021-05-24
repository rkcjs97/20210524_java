package ex_class;
//핸드폰 클래스
//필드:이름, 용량,
//생성자, 게터, 세터, toString
class Phone{
	private String name;
	private int cap;
	private int pix;
	
	public Phone() {
		super();
	}

	public Phone(String name,int cap,int pix){
		this(name,cap);//나 자신의 생성자 호출, 반드시 가장 먼저 실행
		this.pix = pix;
	}

	public Phone(String name, int cap) {
		super();
		this.name = name;
		this.cap = cap;
	}
	
	public Phone(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCap() {
		return cap;
	}

	public void setCap(int cap) {
		this.cap = cap;
		System.out.println(this);
	}

	public int getPix() {
		return pix;
	}

	public void setPix(int pix) {
		this.pix = pix;
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", cap=" + cap + ", pix=" + pix + "]";
	}

	
}

public class J20210420_02_phone {

	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Phone p1 = new Phone("갤럭시",512,1200);
		System.out.println(p1);

	}

}
