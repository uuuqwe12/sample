package co.edu.reference;

public class ForExample01 {

	public static void main(String[] args) {
		
		int[] tempAry = new int[5];
		for(int i=0;i<tempAry.length;i++) {
			tempAry[i] = (int)(Math.random()*50);
		}
		//제일 큰 값을 max
		int max = 0;
		for(int num : tempAry) { //향상된 for문. (배열에 들어있는 개수 만큼 반복.)
			System.out.println(num);
			if(num>max) {
				max = num;
			}
		}
		System.out.println("제일 큰 값: "+max);
	}

}
