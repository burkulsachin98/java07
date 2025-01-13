package org.oops_by_apna_college;

class Student{

	String name;
	int age;

	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);	
	}
	
	Student(String name ,int age){//Constructor
		this.name=name;
		this.age=age;
		
		}
	
	}
public class OopsEx2 {
	public static void main (String args []) {
		Student p1= new Student("sachin",22 );
		

		p1.printInfo();
		
	}

}






