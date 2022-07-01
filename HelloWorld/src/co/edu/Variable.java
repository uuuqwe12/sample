package co.edu;

public class Variable {
	public static void main(String[] args) {
		byte b1 = 128-1; 
		short b2 = 32768-1;
		long b3 = 9223372036854775807L;
		char c1='ㄱ';
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(b3);
		System.out.println((int)c1+1);
		
		
		//c1++;
		for (int i =0; i < 26; i++) {
		
		System.out.println(c1++);
		}
	}
}
