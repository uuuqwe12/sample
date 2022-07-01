package co.edu;

public class HelloWorld {
	public static void main(String[] args) {
		String name = "이현성";
		
		int myAge = 20;
		int yourAge;
		yourAge =22;
		double height = 162.4;
		boolean isMarried = true;
		String myAddress = "대구시";
		
		myAge = 30;
		height = 165.2;
		
		int result = myAge + yourAge; 
	
		double result1 = (double) myAge + height;
		
		System.out.println("안녕하세요 " + name +" 입니다.");
		System.out.println(result1);
		
	
	}
}