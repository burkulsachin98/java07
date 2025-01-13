package org.interviewprograms;

public class ArmstrongNumber {

	/*
	 * An Armstrong Number is a number in which the sum of the cubes of each digit
	 * is equal to the number itself.
	 */

	public static void main(String[] args) {
		int no = 153;
		int temp = no;
		int mod;
		int arm = 0;
		while (no > 0) {
			mod = no % 10;
			arm = mod * mod * mod + arm;
			no = no / 10;
		}

		if (temp == arm) {
			System.out.println("no is armstrong");

		} else {
			System.out.println("no is not armstrong");
		}

	}

}
