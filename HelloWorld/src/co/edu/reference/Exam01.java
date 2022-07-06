package co.edu.reference;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int sum = 0;
		double avg = 0.0;
		int max = 0;
		Scanner sn = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.println("선택 >");
			
			int selectNo = Integer.parseInt(sn.nextLine());
			
			if(selectNo==1) {
				System.out.println("학생수> ");
				studentNum = Integer.parseInt(sn.nextLine());
				scores = new int[studentNum];
				System.out.println("정상적으로 처리되었습니다.");
				
			} else if(selectNo==2) {
				System.out.println("점수입력> ");
				for(int i = 0; i<scores.length ;i++) {
					System.out.println("scores[" + i + "]> ");
					scores[i] = Integer.parseInt(sn.nextLine());
				}
			} else if(selectNo==3) {
				for(int i=0; i<scores.length ;i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
				}
				
			} else if(selectNo==4 ) {
				System.out.println("분석> ");
				for(int i=0;i<scores.length;i++) {
				sum+=scores[i];
				avg = (double)sum/scores.length;
				if(max<scores[i]) {
					max =scores[i];
				}
				}
				System.out.println("점수의 합: "+sum);
				System.out.println("최고 점수: "+max);
				System.out.println("평균 점수: "+avg);
			} else if(selectNo==5) {
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}
			
			} 
		System.out.println("프로그램 종료.");
		}

	}


