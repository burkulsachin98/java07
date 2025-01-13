package Java_Practice;

public class ConstructorEx1 {

	public static void main(String[] args) {

		ConstructorEx1 cr = new ConstructorEx1();// cons 1 called
		//ConstructorEx1 cr1 = new ConstructorEx1(10);
		//ConstructorEx1 cr2 = new ConstructorEx1(10, "Sachin");
	}
	ConstructorEx1() {

		this(0);// cons 2 called

		System.out.println("Default constructor called");
	}
	ConstructorEx1(int a) {

		this(0, "Default string");// Cons 3 called
		System.out.println("1 parameter constructor called ");

	}
	ConstructorEx1(int b, String name) {

		System.out.println("2  parameter constructor called");
	}
}
