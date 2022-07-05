package co.edu.reference;

public class Example01 {

	public static void main(String[] args) {
		//반복문 복습
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			if(i%2==0) {
			int p = sum+=i;
			System.out.println(p);
			}
		}
	}
}
