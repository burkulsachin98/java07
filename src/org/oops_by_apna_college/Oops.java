package org.oops_by_apna_college;

class Pen{

	String color;
	String type;

	public void write() {
		System.out.println("writting Something");
	}

	public void printcolor() {
		System.out.println(this.color);
	}
}

public class Oops {
	public static void main (String args []) {
		Pen p1= new Pen();
		p1.color="blue";
		p1.type="gel";

		Pen p2 =new Pen();
		p2.color="black";
		p2.type="ball point";

		p1.write();
		p1.printcolor();
		p2.printcolor();

	}

}
