package org.interviewprograms;

public class MissingElementsInArray {

	public static void main(String[] args) {

		int ar[] = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };

		int exp = ar.length + 1;
		int tot = exp * (exp + 1) / 2;
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {

			sum = sum + ar[i];

		}
		System.out.println(tot - sum); 
	}
}
