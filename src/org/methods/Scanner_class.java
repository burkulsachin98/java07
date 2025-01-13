package org.methods;
import java.util.Scanner;  

public class Scanner_class {
	
	public static void main (String [] args) {
		
		
		
		Scanner s = new Scanner(System.in);
		
		 System.out.println("Enter ");
		 
		 int num=	s.nextInt();
		 
		 evenOdd ogb = new evenOdd(num);
		 
		 ogb.getOddEven();
	
	 
	}
	
	

}
