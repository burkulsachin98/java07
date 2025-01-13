package org.conditionalstatements;

public class PrintResult {

	public static void main(String[] args) {

		test1();
		
	}
//nested if else 

	public static void test1() {
		int  marks =99;
		if (marks>=40){
			if(marks>=50){
				if(marks>=60){
					if(marks>=66){
						System.out.println("Distinction");
					}else {
						System.out.println("First class ");}
				}else {
					System.out.println("second Class");}
			}else {
				System.out.println("Pass Class");}
		}else {
			System.out.println("Fail");
		}
	}

}