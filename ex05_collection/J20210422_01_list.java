package ex05_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


//자료구조:프로그램에서 사용되는 데이터를 메모리나 저장장치에 저장하고 이를 사용하는 
//논리적인 구조, 자료구조에 따라 프로그램의 성능이 좌우된다

//프레임워크 : 잘 정의된 구조 또는 골격
//자바의 프레임워크 : 잘 정의된 구조의 클래스들
//프로그래머는 잘 정의된 클래스들을 가져다 쓰면 된다 
//자료구조의 데이터의 저장방식 : 리스트, 스택, 큐, 트리, 해쉬
//알고리즘(데이터를 가공치리의 방법) :  선택정렬, 버블정렬, 퀵정렬, 이진탐색...
//컬렉션 프레임워크: 데이터를 잘 다루기 위해서 클래스들을 구조화해서 정의
//                   데이터의 저장방법과 알고리즘에 대한 프레임워크
public class J20210422_01_list {

	public static void main(String[] args) {
		//List<E> 
		//저장순서가 있다(index가 있다)
		//데이터 중복 허용
		//1) ArrayList : 배열구조 : 검색시 유리, 추가,삭제 어렵다
//		ArrayList<Integer> arrlist=new ArrayList<>();
////		arrlist.add(10);
////		arrlist.add(20);
////		arrlist.add(30);
//		System.out.println(arrlist.size());
//		//for문
//		for(int i=0; i<3; i++) {
//			arrlist.add((i+1)*10);
//		}
//		
//		//for문
//		for(int i=0; i<arrlist.size();i++) {
//			System.out.println(arrlist.get(i));
//		}
//		//foreach문
//		for(int i : arrlist) {
//			System.out.println(i);
//		}
//
//		arrlist.remove(1);
//		System.out.println(arrlist);
//		
//		arrlist.add(1,50);
//		System.out.println(arrlist);
		
		//실습)이름을 입력을 받아 ArrayList만들기
//		List<String> arrName = new ArrayList<>();
//		Scanner sc = new Scanner(System.in);
//		while (true) {
//			System.out.print("이름은?");
//			String name = sc.next();
//			if (name.equals("quit")) break;
//			arrName.add(name);
//			
//		}
//		for(int i=0; i<arrName.size(); i++) {
//			System.out.println(i+1 +":" + arrName.get(i));
//		}
		
		//삭제
		//1)안
//		arrName.add("hong");arrName.add("park");arrName.add("park");arrName.add("park");
//		System.out.println(arrName);
//		System.out.print("삭제할 이름은?");
//		String name = sc.next();
//		for(int i=0; i< arrName.size(); i++) {
//			if (arrName.get(i).equals(name)) {
//				arrName.remove(i);
//				i--;
//			}
//		}
//		System.out.println(arrName);
		
		//2안 추천
		//반복자 : iterator :인덱스를 사용하지 않음
//		arrName.add("hong");arrName.add("park");arrName.add("park");arrName.add("park");
//		System.out.println(arrName);
//		System.out.print("삭제할 이름은?");
//		String name = sc.next();
//		//반복자 생성
//		Iterator<String> it = arrName.iterator();
//		while(it.hasNext()) {
//			String n = it.next();
//			if (name.equals(n)) it.remove();
//		}
//		System.out.println(arrName);
		
		//실습)iterator를 이용해서 출력
		//선언과 동시에 초기화
//		List<String> list = Arrays.asList("red", "blue", "yellow");
//		System.out.println(list);
//		Iterator<String> it = list.iterator();
//		System.out.println(it);
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		//Arrays.asList() : 고정길이 배열 반환 
//		List<String> list = new ArrayList<String>(Arrays.asList("red","blue","yello"));
//		list.remove(0);
//		System.out.println(list);
		
//		List<String> list = Arrays.asList("red", "blue", "yellow");
//		System.out.println(list);
//		String color = sc.next();
//		//반복자 생성
//		Iterator<String> it = list.iterator();
//		while(it.hasNext()) {
//			String n = it.next();
//			if (color.equals(n)) it.remove();
//		}
		
		
		
		//실습)반학생들의 키를 입력 받아 평균을 구하시오
//		List<Double> heiList = new ArrayList<>();
//		Scanner sc = new Scanner(System.in);
//		double sum = 0;
//		while (true) {
//			System.out.print("키는?");
//			double hei = sc.nextDouble();
//			if (hei==0) break;
//			heiList.add(hei);
//			sum += hei;
//		}
//		System.out.println(sum);
//		System.out.println(heiList.size());
//		System.out.println(sum / heiList.size());
		
//		System.out.println(100.0 /0); //무한
//		System.out.println(100/0); //예외
		
		
		
		//2)LinkedList :리스트 기반
		//각요소가 자신의 이전요소의 주소와 다음요소의 주소를 가지고 있다
		//추가/삭제가 쉽다, 검색시 성능 저하
		
		List<String> linkList = new LinkedList<>();
		linkList.add("python");
		linkList.add("java");
		linkList.add("c");
		System.out.println(linkList);
		for(int i=0; i< linkList.size(); i++) {
			System.out.println(linkList.get(i));
		}
		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
