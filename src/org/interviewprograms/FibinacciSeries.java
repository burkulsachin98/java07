package org.interviewprograms;

public class FibinacciSeries {

	public static void main(String[] args) {
		/*
		 * In fibonacci series, next number is the sum of previous two numbers for
		 * exampl e 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
		 */
		int a = 1;
		int b = 2;
		int c;
		int count = 10;
		System.out.println(a + " " + b);
		for (int i = 2; i <= count; i++) {
			c = a + b;

			System.out.println(" " + c);

			a = b;
			b = c;

		}

	}

}
