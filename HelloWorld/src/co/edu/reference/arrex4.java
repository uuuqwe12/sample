package co.edu.reference;

public class arrex4 {

	public static void main(String[] args) {
		// A반의 학생 3명의 점수가 80, 85, 83
		// B반은 79, 84, 90

		int[][] banAry = new int[2][3];
		banAry[0][0] = 80;
		banAry[0][1] = 85;
		banAry[0][2] = 83;
		banAry[1][0] = 79;
		banAry[1][1] = 84;
		banAry[1][2] = 90;

//		int sum = 0;
//		for(int i=0;i<banAry[0].length;i++) {
//			sum += banAry[0][i];
//		}
//		System.out.printf("A반의 평균: "+sum/3);
//		System.out.println("");
//		
//		int sum2 = 0;
//		for(int i=0;i<banAry[1].length;i++) {
//			sum2 += banAry[1][i];
//		}
//		System.out.printf("B반의 평균: "+sum2/3);
		
		//A반
		double sum = 0;
		for (int i = 0; i < banAry[0].length; i++) {
			sum += banAry[0][i];
		}
		double avg = sum / banAry[0].length;
		System.out.printf("A반의 평균: %.1f", avg);
		System.out.println("");

		//B반
		double sum2 = 0;
		for (int i = 0; i < banAry[1].length; i++) {
			sum2 += banAry[1][i];
		}
		double avg2 = sum2 / banAry[1].length;
		System.out.printf("B반의 평균: %.1f", avg2);

	}

}
