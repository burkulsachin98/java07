package org.interviewprograms;

public class SwappingOfString {

	public static void main(String[] args) {
		String a="Altres";
		String b="Technologies";

		a=a+b;  //appned both string

		//Store a into b

		b=a.substring(0,a.length()-b.length());


		a=a.substring(b.length());


		System.out.println(a);

		System.out.println(b);



	}

}
