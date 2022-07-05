package co.edu.reference;

import java.util.Scanner;

public class ForExample02 {
	public static int sumAry(int[] ary) {
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}
		return sum; // 메소드를 호출한 영역으로 sum의 값을 반환.
	}
	public static double avgAry(double[] ary) {
		double avg = 0;
		for (int i = 0; i < ary.length; i++) {
			avg = sumAry(ary)/ary.length;
		}
		return avg; // 메소드를 호출한 영역으로 sum의 값을 반환.
	}

	public static void main(String[] args) {

		// 문제1. inAry배열의 합과 평균
		int sum = 0;
		double avg = 0;

		int[] intAry = { 34, 23, 56, 22, 99, 28 };

		sum = sumAry(intAry);
//		for (int i = 0; i < intAry.length; i++) {
//			sum += intAry[i];
//		}
		avg = avgAry(intAry);
		System.out.printf("합계는 %d, 평균은 %.1f", sum, avg);
		System.out.println();

		// 문제2. intArray배열의 합과 평균
//		int sum2 = 0;
		double avg2 = 0;
		int[] intArray = new int[6];
		sum = sumAry(intArray);
//		for (int i = 0; i < intArray.length; i++) {
//			intArray[i] = (int) (Math.random() * 100) + 1;
//			sum2 += intArray[i];
			avg2 = (double) sum / intArray.length;
//		}
		System.out.printf("합계: %d, 평균: %.1f", sum, avg2);
		System.out.println();
		// 문제3.

		double avg3 = 0;
		int[] scanArray = new int[5];
		Scanner sn = new Scanner(System.in);

		for (int i = 0; i < scanArray.length; i++) {
			System.out.println("임의의 수를 입력>>>>");
			scanArray[i] = sn.nextInt();
			sum = sumAry(scanArray);
			avg3 = (double) sum / scanArray.length;
		}
		System.out.printf("배열의 합: %d, 평균: %.1f", sum, avg3);

	}

}
