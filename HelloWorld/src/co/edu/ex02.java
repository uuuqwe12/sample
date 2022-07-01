package co.edu;

public class ex02 {
//
	public static void main(String[] args) {
		 
		double myHeight = 177.0;
		double yourHeight = 200.9;
		double theDifference = yourHeight - myHeight;
		
		
			if(myHeight < yourHeight) {
				System.out.println("나의 키가 " +Math.ceil(theDifference)+ " 만큼 더 작습니다.");
			} else {
				System.out.println("나의 키가 " +String.format("%.1f",theDifference)+ " 만큼 더 큽니다.");
			}

	}

}
