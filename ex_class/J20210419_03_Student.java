package ex_class;

import java.util.Arrays;

//학생클래스
//필드: 반,이름,점수,합계
class Student{
	String group;
	String name;
	int[] score = new int[3];
	int sum;
	
	//메소드의 오버로딩
	//Call By Reference
	void sumCal(int[] score) {
		sum=0;
		this.score = score;
		for(int i = 0; i<score.length;i++) {
			sum += score[i];
		}
	}
	
	//Call By Value
	void sumCal(int a, int b, int c) {
		sum=0;
		score[0]=a; score[1]=b;score[2]=c;
		sum = a+b+c;
	}
	
	double avgCal() {
		double avg = (double)sum/score.length;
		return (double)Math.round(avg*100)/100;
	}
}
//메소드: 합계계산, 평균을 계산해서 반환
public class J20210419_03_Student {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Student s1= new Student();
		s1.sumCal(79,80,66);
		System.out.println(Arrays.toString(s1.score));
		System.out.println(s1.sum);
		s1.sumCal(new int[] {77,61,95});
		System.out.println(Arrays.toString(s1.score));
		System.out.println(s1.sum);
		System.out.println(s1.avgCal());
		

	}

}
