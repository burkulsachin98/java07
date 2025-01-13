package org.oops_by_apna_college;



class Child{
	String name;
	int age ;
	
	
public void printInfo() {
	System.out.println(this.name);
	System.out.println(this.age);
	}

Child(Child ch2){
	this.name=ch2.name;
	this.age=ch2.age;
	
}
Child(){
	
}

	
}

public class Copy_Cons {

	public static void main(String[] args) {
		
		Child ch1 =new Child();
		ch1.name="Ziya";
		ch1.age=23;
		
		Child ch2= new Child(ch1);
		ch2.printInfo();
	}

}
