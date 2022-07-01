package co.edu;

public class ex01 {
	public static void main(String[] args) {

		int q1 = 150;
		long l1 = 2155132;
		int result = q1 + (int)l1;
		System.out.println(result);
		
		for(int i1=1; i1 <10; i1++) {
		System.out.println(i1 * q1);
		}
		
		boolean isTrue = false;
		
		int myAge = 10;
		int yourAge = 12;
		
		isTrue = myAge > yourAge;
		if(isTrue) {
			System.out.println("나의 나이가 더 많다.");
		} else {
			System.out.println("나의 나이가 더 적다.");
		}
		
		float f1 = 23.4f; // 4byte
		System.out.println(f1);
		double d1 = 23.4; // 8byte
		
		float sum =2345L + 22.3F;
		
		
		
	}
}