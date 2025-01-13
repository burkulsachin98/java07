package org.interviewprograms;

public class PrimeNumber {

	/*
	 * A prime number is a number which is divisible by 1 and itself.*?
	 * 
	 */
	public static void main(String[] args) {
		int no = 3;
		int count = 0;

		for (int i = 1; i <= no; i++) {
			if (no % i == 0) {
				count++;

			}

		}
		if (count == 2) {	
			System.out.println("No is prime number");
		} else {
			System.out.println("No is not prime number");
		}

	}

}
