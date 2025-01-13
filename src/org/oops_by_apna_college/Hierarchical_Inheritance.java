package org.oops_by_apna_college;


/*
 * In Hierarchical Inheritance, one class serves as a superclass (base class) for more 
 * than one subclass. In the below image, class A serves as a base class for the
 *  derived classes B, C, and D.
 */
class A{
	public void print_A() {
		System.out.println("Class A");
	}
}
class B extends A{
public void print_B() {
		System.out.println("Class B");
	}
}
class C extends A{
public void print_C() {
	System.out.println("Class C");
	}
}
class D extends A{
public void print_D() {
	System.out.println("Class D");
	}
}
public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		A a= new A();
		a.print_A();
		
		B b= new B();
		b.print_B();
		b.print_A();
		
		C c= new C();
		c.print_C();
		c.print_A();
		
		D d = new D();
		d.print_A();
		d.print_D();
	
	}

}
