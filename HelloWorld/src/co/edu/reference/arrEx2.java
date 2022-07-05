package co.edu.reference;

public class arrEx2 {

	public static void main(String[] args) {

		int[] intAry = { 20, 27, 15, 33, 29 };
		intAry[2] = 30;
		int temp = intAry[0];
		intAry[0] = intAry[1];
		intAry[1] = temp;
		// 배열의 크기 = 5, intAry.length
//		for (int i = 0; i < intAry.length; i++) {
//			if (intAry[i] % 2 == 0) {
//				System.out.println(intAry[i]);
//			}
//			if (i % 2 == 0) {
//				System.out.println(intAry[i]);
//		}
		int sum=0;
		for(int i=0;i<intAry.length;i++) {
			sum+=intAry[i];
		}
		System.out.println("합계:"+sum);
	}

}
