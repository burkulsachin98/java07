package org.oops_by_apna_college;


class Shape{
	String color;
	
	public void area() {
		System.out.println("displays area");
	}
	
}

class Triangle extends Shape{

	public void area(int l, int h) {
		System.out.println(1/2*l*h);
	}
	
}

public class Inheritance {

	public static void main(String[] args) {
		Triangle t= new Triangle();
		t.color="Red";
		t.area();
		
		

	}

}
