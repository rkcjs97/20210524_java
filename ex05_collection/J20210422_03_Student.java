package ex05_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//학생클래스
//필드:번호(int no), 이름(String name), 전화번호(String tel)
class Student{
	private int no;
	private String name;
	private String tel;
	public Student() {}
	public Student(int no, String name, String tel) {
		this.no = no;
		this.name = name;
		this.tel = tel;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", tel=" + tel + "]";
	}
}

public class J20210422_03_Student {
	public static void main(String[] args) {
//		Student std1 = new Student(1, "이선희", "010-9999-9999" );
//		Student std2 = new Student(2, "BTS", "010-8888-8888" );
//		Student std3 = new Student(3, "최민식", "010-7777-7777" );
//		
//		//ArrayList에 저장
//		List<Student> arrStd = new ArrayList<>();
//		arrStd.add(std1);
//		arrStd.add(std2);
//		arrStd.add(std3);
//		System.out.println(arrStd);
//		
//		for(int i=0; i < arrStd.size() ; i++) {
//			//System.out.println(arrStd.get(i));
//			Student s = arrStd.get(i);
//			System.out.println(s.getNo() +" " + s.getName()+" "+s.getTel());
//		}
//		
//		for(Student s : arrStd) {
//			System.out.println(s.getNo() +" " + s.getName()+" "+s.getTel());
//		}
		
		//Map에저장 (Key:no, Value:Student)
//		Student std1 = new Student(1, "이선희", "010-9999-9999" );
//		Student std2 = new Student(5, "BTS", "010-8888-8888" );
//		Student std3 = new Student(6, "최민식", "010-7777-7777" );
//		
//		Map<Integer, Student> hmap = new HashMap<>();
//		hmap.put(std1.getNo(), std1);
//		hmap.put(std2.getNo(), std2);
//		hmap.put(std3.getNo(), std3);
//		System.out.println(hmap);
//		
//		Student s = hmap.get(5);
//		System.out.println(s.getNo() + " " + s.getName() + " " + s.getTel());
//		
//		System.out.println(hmap.keySet());
//		
//		Set<Integer> ks = hmap.keySet();
//		
//		System.out.println(ks);
//		
//		for(int i : ks) {
//			System.out.println(hmap.get(i));
//		}
//		
//		
//		Iterator<Integer> it = ks.iterator();
//		while(it.hasNext()) {
//			int key = it.next();
//			Student s1 = hmap.get(key);
//			System.out.println(s1.getNo() + " " + s1.getName() + " " + s1.getTel());
//		}
		
		//실습) result: "success"
		//data : ArrayList<Student>
		Student std1 = new Student(1, "이선희", "010-9999-9999" );
		Student std2 = new Student(5, "BTS", "010-8888-8888" );
		Student std3 = new Student(6, "최민식", "010-7777-7777" );
		List<Student> list = new ArrayList<>();
		Map<String,Object> hmap = new HashMap<>();
		
		hmap.put("result", "success");
		list.add(std1);
		list.add(std2);
		list.add(std3);
		
		hmap.put("data", list);
		System.out.println(hmap);
		String result = (String)hmap.get("result");//다운캐스팅
		
		//만약 result가 succes 라면 학생정보를 출력
		if(result.equals("success")) {
			List<Student> stdlist = (List<Student>)hmap.get("data");
			for(Student i:stdlist) {
				System.out.println(i.getNo() +"번 이름:"+i.getName()+" 휴대폰:"+i.getTel());
			}
		
		}
		else
			System.out.println("error");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
