package co.edu.reference;

public class MethodExample01 {

	public static void main(String[] args) {
		// 실행구문.
		long sum = sum(20); // 매개값(arguments)
		showInfo("이현성", 29);
		showInfo("성이현", 24);
		System.out.println();
		printStar(5, "♬");
		System.out.println();
		printShape(5, "★");
		System.out.println();
		printGugudan(11);
		printGgd();
	}

	public static void printGgd() {
		for (int i = 2; i < 10; i++) {
			System.out.print("[" + i + "단]\t");
		}
		System.out.println();
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j + "\t");
			}
			System.out.println();

		}
	}

	public static void printGugudan(int num) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}

	public static void printShape(int times, String shape) {

		for (int c = 0; c < times; c++) {
			for (int j = 0; j < c; j++) {
				System.out.print(" ");
				System.out.print(shape);
			}
			System.out.println();
		}
	}

	public static void printStar(int times, String shape) {
		for (int i = 1; i <= times; i++) {
			System.out.print(shape);
		}
	}

	public static void showInfo(String name, int age) {
		System.out.println("반갑습니다. " + name + "입니다. 나이는 " + age + "살 입니다.");
	}

	// 정의구문.
	public static long sum(int num) { // 매개변수(parameter)
		int result = num * 2;
		return (long) result; // 자동형변환(promotion)
	}
}
