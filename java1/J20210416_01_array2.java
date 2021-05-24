package java1;

import java.util.Scanner;

public class J20210416_01_array2 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
//		int[][] arr = new int[3][4];
//		for(int i=0;i<arr.length;i++) {
//			for(int j = 0; j<arr.length;j++) {
//				arr[i][j] = i*4+j+1;
//				System.out.println(arr[i][j]);;
//				
//			}
//		}뇨내ㅕㅅ
		
		//실습 2명의 학생의 국영수 점수를 입력받아 배열에 저장하고 각자의 합계와 평균을 
		int[][] sco = new int[2][3];
		String[] sub = {"국어","영어","수학"};
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<sco.length;i++) {
			System.out.printf("[%d번]\n",i+1);
			int sum = 0;
			for(int j = 0; j<sco[i].length;j++) {
				System.out.print(sub[j]);
				System.out.print("점수:");
				sco[i][j] = sc.nextInt(); 
				sum += sco[i][j];
			}
			System.out.printf("합계:%d ",sum);
			System.out.printf("평균:%f\n",(double)sum/3);
		}
		
		for(int i=0;i<3;i++) {
			int avg=0;
			for(int j =0;j<2;j++) {
				avg += sco[j][i];
			}
			
			System.out.printf("%s의 평균:%.2f\n",sub[i],(double)avg/2);
		}

	}

}
