package org.oops_by_apna_college;

class Overloading{

	String name;
	int age;
	
	public void printInfo(String name) {
		System.out.println(name);
	}

	public void printInfo(int age) {
		System.out.println(age);
	}

	public void printInfo(String name, int age) {
		System.out.println(name+" "+age);

	}
}
public class MethodOverloading {
	
	public static void main(String[] args) {
		Overloading o =new Overloading();
		o.name="Aman";
		o.age=22;


		o.printInfo(o.name,o.age);
		o.printInfo(o.age);

	}

}
