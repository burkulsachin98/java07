package org.methods;

public class LocalGlobalVariable {
	
	int a=100,b=400;

	public static void main (String[]args) {
		System.out.println("Program starts");
		LocalGlobalVariable obj = new LocalGlobalVariable();
		obj.test();
		System.out.println("program ends");
	}
	public void test() {
		int a=300,b=800;
		System.out.println("LV a="+a);
		System.out.println("LV b="+b);
		
		System.out.println("GV a="+this.a);
		System.out.println("GV b="+this.b);
		
	}
		
	}

