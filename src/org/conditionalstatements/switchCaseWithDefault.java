package org.conditionalstatements;

public class switchCaseWithDefault {

	public static void main(String[] args) {
		 int day =8;
		 switch (day) {
		 case 1:
			 System.out.println("Monday");
			 break;
		 case 2:
			 System.out.println("Friday");
			 break;
		default :
			 System.out.println("Looking forward to the Weekend");
		 
		 }
		

	}

}

/*The default keyword specifies some code to run if there is no case match:
 */
/* Note that if the default statement is used as the 
 last statement in a switch block, it does not need a break.*/
