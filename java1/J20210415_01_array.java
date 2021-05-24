/**
 * 
 */
package java1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class J20210415_01_array {


	public static void main(String[] args) {
		// 배열
//		int cnt=5;
//		int[] arr; // 선언은 stack에
//		arr = new int[5];//배열은 heap에 생성
//		//자바는 동적배열
//		arr = new int[cnt];//객체생성해서 주소를 arr 에 대입
//		arr[0] = 1;
//		System.out.println(arr[0]);
		
//		int[] arr = new int[5];
//		
//		for(int i = 0; i<arr.length;i++) {
//			arr[i] = (i+1)*10;
//			System.out.println(arr[i]);
		
//		//선언과 초기화
//		int[] arr = new int[] {10,20,30};
//		//for~each;
//		for(int a: arr) {
//			System.out.println(a);
//		}
//		//Arrays 클래스 이용 문장열 출력
//		System.out.println(Arrays.toString(arr));//오버로딩
//		System.out.println(arr.toString());//오버라이딩
//		System.out.println(arr); // println은 toString()실행
		
		//실습) 세 학생의 점수를 입력받아서 배려에 대입하고 합계 평균
//		int[] score = new int[3];
//		int sum = 0;
//		
//		Scanner sc = new Scanner(System.in);
//	
//		for(int i=0; i<score.length;i++) {
//			score[i]=sc.nextInt();
//		}
//		
//		for(int s:score) {
//			sum +=s;
//		}
//		
//		System.out.printf("%d\n",sum);
//		System.out.printf("%.2f\n", (double)sum/3);
//
		//문자열 배열
//		String[] arr = {"Java","Python","C"} ;
//		
//		for(String i: arr) {
//			System.out.println(i.toString());
//		}
		
		//실습) 좋아하는 색 3가지를 입력받아 배열을 출력
//		String[] col = new String[3];
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int j=0;
//		
//		for(String i:col) {
//			System.out.print("입력:");
//			col[j]  = sc.nextLine();
//			j++;
//		}
//		
//		for(String i : col) {
//			System.out.print(i+" ");
//		}
		
		//실습)피보나치 N개 구하기
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		
//		int[] fi = new int[N];
//		
//		fi[0] = 0;
//		fi[1] = 1;
//				
//		for(int i=2;i<N;i++) {
//			fi[i] = fi[i-2]+fi[i-1];
//			
//		}
//		
//		for(int f:fi) {
//			System.out.println(f);
//		}
//		
		//실습)시험 채점 프로그램
//		int[] an = new int[5];
//		int[] ra = new int[]{1,2,3,4,5};
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int p = 0;
//		
//		for(int i=0; i<5;i++) {
//			
//			an[i]=sc.nextInt();
//			
//			if(an[i]==ra[i])
//				p +=20;
//		}
//		System.out.printf("%d점입니다.",p);
		
		//실습 최대값(최솟값)출력
//		int[] arr = new int[]{1,6,7,2,5};
//		int m = arr[0];
//		int t = 0;
//		
//		for(int i =0;i<4;i++) {
//			int a = arr[i];
//			
//			if(m<a) {
//				m = a;
//				t++;
//				System.out.println(t);
//			}
//		}
//		System.out.println(m);//최댓값
////		
//		for(int i=0;i<4;i++) {
//			int a = arr[i];
//			
//			if(m>a) 
//				m=a;
//		}
//		
//		System.out.println(m);//최솟값
		
		//실습 선택정렬(오름차순정렬)
		//{2,4,5,6,7}(오름차순)
		
//		int[] arr = {8,5,4,10,7};
//		
//	
//		
//		
//		for(int i = 0;i<arr.length;i++) {
//			for(int j =i+1;j<arr.length;j++) {
//				if(arr[i]>arr[j]) { 
//					int t = arr[i];
//					arr[i] = arr[j];
//					arr[j] = t;
//				}
//				
//			}				
//		}
//		for(int i:arr) {
//			System.out.print(i+" ");
//		}
//		
		
		
//		for(int i:arr) {
//			System.out.println(i);
//		}
		//{7,6,5,4,2}(내림차순)
		
//		int[] arr2 = new int[]{2,4,5,6,7};
//		int m2 = arr2[0];
//		
//		for(int i =0;i<4;i++) {
//			for(int j=0; j<4;j++) {
//				int a = arr2[i];
//			
//				if(m2<a) 
//					m2 = a;
//			}
//			m2= arr2[i];
//	
//		}
//		
//		for(int i:arr2) {
//			System.out.print(i+" ");
//		}
		
		//실습 로또번호 맞춘 개수 출력
		
		//배열의 복사 
//		int[] src = {1,2,3,4,5};
//		int[] dest = src;
//		
//		System.out.println(src);
//		System.out.println(dest);
//		System.out.println(Arrays.toString(src));
//		System.out.println(Arrays.toString(dest));
//		System.out.println("----------------------");
//		src[1]=20;
//		
//		System.out.println(Arrays.toString(src));
//		System.out.println(Arrays.toString(dest));
		
		//깊은 복사 : 값을 복사
		int[] src = {1,2,3,4,5};
		int[] dest = new int[5];
//		
//		System.out.println(Arrays.toString(src));
//		System.out.println(Arrays.toString(dest));
//		System.out.println("----------------------");
//		
//		for(int i=0; i<src.length;i++) {
//			dest[i] = src[i];
//		}
//		
//		System.out.println(Arrays.toString(src));
//		System.out.println(Arrays.toString(dest));
//		
//		src[1]=20;
//		
//		System.out.println(Arrays.toString(src));
//		System.out.println(Arrays.toString(dest));
//		
//		// 프레임워크를 이용한 데이터추가
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		arr.add(10);
//		arr.add(20);
//		System.out.println(arr);
		
		System.arraycopy(src, 2,dest,0,2);
		System.out.println(Arrays.toString(src));
		System.out.println(Arrays.toString(dest));
	}

}
