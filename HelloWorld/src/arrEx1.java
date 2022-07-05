
public class arrEx1 {

	public static void main(String[] args) {
		// 배열의 저장공간 선언.
		int[] intAry = new int[10]; // 저장공간 10개인 객체를 만든 것.
		intAry[0] = 10; // 첫번째 위치에 10을 할당.
		intAry[4] = 50;

//		System.out.println(intAry.length); // 배열의 크기를 알려주는 읽기전용의 속성.
		for (int i = 0; i < 10; i++) {
			System.out.println(intAry[i]);
		}
		
		double[] dbAry = new double[5]; //double형 공간 5개 선언.
		for(int i=0; i<dbAry.length; i++) {
			System.out.println(dbAry[i]);
		}
		 boolean[] boolAry = new boolean[3]; //boolean 초기값 false출력.
		 boolAry[1] = true; //boolean형만 대입가능.
		 for(int i=0;i<boolAry.length;i++) {
			 System.out.println(boolAry[i]);
		 }
		 
		 String[] strAry = {"홍길동", "김민수", "허민기"}; //3개의 값을 할당.
//		 strAry[3] = "황경영"; //문법상은 괜찮은데 오류 발생. 배열의 범위를 벗어남.
		 strAry[2] = "황경영";
		 for(int i=0;i<strAry.length;i++) {
			 System.out.println(strAry[i]);
		 }

	}

}
