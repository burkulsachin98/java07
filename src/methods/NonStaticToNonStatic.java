package methods;

public class NonStaticToNonStatic {//non static to non static method calling
	int a=100, b=600;
		
	public static void main (String [] args) {
		System.out.println("P starts");
		NonStaticToNonStatic obj = new NonStaticToNonStatic();
		obj.test1();
		System.out.println("P ends");
	}
	
	public  void test1() {//non static test 1
		System.out.println("In test 1");
		//way 1 by using object
		NonStaticToNonStatic obj = new NonStaticToNonStatic();
		obj.test2();
		//way 2 direct by name 
		//test2();
		
		// way 3 by using 
		System.out.println("a= "+ this.a);
	}
	public  void test2() { // non static test 2
		System.out.println(" In test 2");
	}

}
