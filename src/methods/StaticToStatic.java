package methods;

public class StaticToStatic {
	static int a=67;
	
public static void test1() {
	System.out.println("InTest 1");
		System.out.println("obj.a="+a);
		test2();
			
}		
		
public static void main (String [] args) {
	//way 1 by creating obj 
	System.out.println("way 1 by obj ");
		// StaticToStatic obj = new StaticToStatic();
		 //obj.test1();
		 
		 //way 2 by calling method directly 
		// System.out.println("way 2 by calling method directly ");
		// System.out.println("a="+a);
		 //test1();
		// test2();
		//way 3 by using class name 
		 System.out.println("way 3 by using clas name ");
		 System.out.println("a="+StaticToStatic.a);
		 StaticToStatic.test1();
		 StaticToStatic.test2();
		 
		 
		 
		 
	 }
		 
	 public static void test2() {
		 System.out.println("InTest 2");
	 }
		

}
