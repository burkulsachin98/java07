package org.interviewprograms;

public class SwappingOfTwoNumberUsing3rdVariable {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		int temp;

		temp = a;  
		a = b;
		b = temp;

		System.out.println("value of a after swapping : "+ a);
		System.out.println("Value of b after swapping : "+ b);
	}

}
