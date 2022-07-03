package co.edu;

public class ex03 {
	public static void main(String[] args) {
//
		System.out.println(10 + 20);
		System.out.println("10" + "20"); 
		System.out.println("내 이름은 \"홍길동\" 입니다.");
		System.out.println("번호\t이름\t직업");
		System.out.println("행 단위 출력\n");
		System.out.println("봄\\여름\\가을\\겨울");
		System.out.println("{\"name\":\"홍길동\",\"age\":20}");
		
		//문자열 -> 정수, 실수.
		int num1 = Integer.parseInt("100");
		double num2 = Double.parseDouble("127.0");	
		
		double result = sum(num1, num2);
		System.out.println("합 결과: " + result);
		System.out.printf("합은 %10.2f 입니다.",result);
		System.out.printf("\n저의 이름은 %s이고, 나이는 %d 입니다.","홍길동",14);
		/
		//이름,나이,몸무게(소수점)
		String name = "이현성";
		int h1 = 29;
		double j1 = 80;
		System.out.printf("\n나의 이름은 %s이고\n나이는%d이고\n몸무게는%.2f입니다.",name,h1,j1);
	}
	
	// 2개의 숫자를 합한 결과를 반환해주는 매소드.
	public static int sum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	public static double sum(int n1, double n2) {
		double sum = n1 + n2;
		return sum;
	}
	
	public static double sum(double n1, double n2) {
		double sum = n1 + n2;
		return sum;
	}
}
