package ex_class;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

//수강생클래스
//필드:코드,이름,수강과목
class Attendee{
	private String code;
	private String name;
	private String subject;
	public Attendee() {
		super();
	}
	public Attendee(String code, String name, String subject) {
		super();
		this.code = code;
		this.name = name;
		this.subject = subject;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Attendee [code=" + code + ", name=" + name + ", subject=" + subject + "]";
	}
	
}
//수강클래스 : LectureManager
//메소드 : 입실 출력, 퇴실 출력
class LectureManager{
	//클래스필드, 클래스변수
	//클래스가 메모리에 로딩될때 생성,프로그램이 종료시 소멸
	//static final : 상수(반드시 선언과 동시에 초기화)
	static final String collegeName="국제학원";
	//인스턴스필드, 객체변수
	//인스턴스생성시 생성, 객체소멸시 소멸
	static final int buildYear = 2001;  
	static final int day; //오늘 날짜
	static { //static 블럭을 이용해서 초기화
		//db나 파일이나 시스템에서 가져오거나 등등..
		Date now = new Date(); //현재날짜 가져오기
		SimpleDateFormat sf = new SimpleDateFormat("dd");
		day = Integer.parseInt(sf.format(now));; 
	}
	 	
//	//자바반 홍길동이 입실
	static void enter(Attendee att) { //지역변수
		System.out.println(day +"일 "+ att.getSubject() + " " + att.getName() +"님 입실");
	}
//	//자바반 홍길동이 퇴실
	static void exit(Attendee att) {
		System.out.println(att.getSubject() + " " + att.getName() +"님 퇴실");
	}
}

public class J20210421_02_Attend {

	public static void main(String[] args) {
		
		System.out.println(LectureManager.collegeName);
		System.out.println(LectureManager.buildYear+" 개원");
		
		Attendee attd1 = new Attendee("A001", "홍길동", "자바");
		System.out.println(attd1);
		
		
		LectureManager.enter(attd1);
		LectureManager.exit(attd1);
		
	}

}
