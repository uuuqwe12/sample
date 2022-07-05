package co.edu.reference;

public class DataTypeExample2 {

	public static void main(String[] args) {
		// 기본데이터타입.
		int num1 = 100;
		int num2 = 100;
		
		System.out.println(num1 == num2);
		
		// 참조데이터타입.
		String str1 = new String("홍길동"); //객체의 주소값이 담긴다.
		String str2 = new String("홍길동"); //객체의 주소값이 담긴다.
		
		System.out.println(str1 == str2); //변수의 주소를 비교
		System.out.println(str1.equals(str2)); // 값을 비교
		
		int result = 0; //기본데이터 값에는 의미 없는 값을 넣어서 초기화.
		str1 = null; //객체와의 연결을 끊겠다.
		System.out.println(str1); //null값이 출력.
	}

}
