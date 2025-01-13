package org.scannerclass;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
	
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the value of a ");
		int a=sc.nextInt();
		System.out.println("Enter the value of b");
			
		int b=sc.nextInt();
	
		int sum =a+b;
		System.out.println("sum="+sum);
		//for string
		System.out.println("Name="+sc.nextLine());
		
		

	}

}
