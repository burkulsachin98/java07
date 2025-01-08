package logical.programs;

public class Star2 {
	
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
		    // Print stars for each row
		    for (int j = 5; j >= i; j--) {
		        System.out.print("*");
		}
		System.out.println( );
	}
}
}



