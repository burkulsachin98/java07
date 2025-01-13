package org.interviewprograms;

public class AdditionOfArray {

	public static void main(String[] args) {
		int[] ar = { 2, 3, 5, 6, 7, 8 };
		int Sum = 0;

		for (int i = 0; i < ar.length; i++) {

			Sum = Sum + ar[i];

		}
		System.out.println(Sum);
	}

}
