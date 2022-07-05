package co.edu.reference;

class Person {
	String name;
	int age;
}

public class DataTypeExample {

	public static void main(String[] args) {

		int num1 = 2520;
		int num2 = num1;
		num1 = 125;

		System.out.println("num1: " + num1); // stack: 2520->125
		System.out.println("num2: " + num2); // stack: 2520->2520

		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 20;

		Person p2 = p1; //참조 주소값이 같다.
		
		p1.name = "박길동";
		p1.age = 52;
		
		p2.name = "김길동";
		p2.age = 62;

		System.out.println("이름: " + p1.name + ",나이: " + p1.age);
		System.out.println("이름: " + p2.name + ",나이: " + p2.age);

//		String name1 = new String("홍길동");
//		String name2 = name1;
//		name1 = "이현성";

	}

}
