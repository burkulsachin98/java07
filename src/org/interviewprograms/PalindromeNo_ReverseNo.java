package org.interviewprograms;

public class PalindromeNo_ReverseNo {

	public static void main(String[] args) {
		int no= 232;
		int temp=no;
		int rem;
		int rev=0;
		while(no!=0) {
			rem=no%10;
			rev= rev*10+rem;
			no=no/10;
		}
		System.out.println(rev);
		if(temp==rev) {
			System.out.println("No is palindrome");
		}else {
			System.out.println("No is not palindrome");
		}
		

	}

}
