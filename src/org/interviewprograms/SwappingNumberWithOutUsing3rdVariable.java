package org.interviewprograms;

public class SwappingNumberWithOutUsing3rdVariable {

	public static void main(String[] args) {
		int a=10;
		int b=20;

		a=a+b; //30
		b=a-b; //3=-20=10
		a=a-b;//30-10=20

		System.out.println("value of a "+a);
		System.out.println("value of b "+b);
	}

}
