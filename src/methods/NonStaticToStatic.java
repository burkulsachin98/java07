package methods;

public class NonStaticToStatic {
static int a=18;

public  void test2() {
	 System.out.println("In Test 2");
	 System.out.println("a="+ NonStaticToStatic.a);
	 NonStaticToStatic.test1();
	 System.out.println("T2 ends ");
	 
	
}

public static void test1() {
	System.out.println("In static  Test 1");
	
	
}
public static void main (String [] args ) {
	System.out.println("P starts");
	NonStaticToStatic obj= new NonStaticToStatic();
	obj.test2();
	System.out.println("P ends");
	
	
}
}
