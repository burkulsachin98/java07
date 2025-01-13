package org.oops_by_apna_college;

class One{
	public void printInfoOne() {
		System.out.println("In Class One");
	}
}
class Two extends One{
	
	public void printInfoTwo() {
		System.out.println("In Class Two");
	}	
}
class Three extends Two{
	public void printInfoThree() {
		System.out.println("In Class Three");
	}
}
public class MultilevelInheritace {

	public static void main(String[] args) {
		Three t = new Three();
		t.printInfoOne();
		t.printInfoTwo();
		t.printInfoThree();

	}

}
