package logical.programs;

public class Duplicate_Elements_in_Array {

	public static void main(String[] args) {
		int [] ar = {4,5,5,7,8,9};
		
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				
				if(ar[i]==ar[j]) {
					System.out.println(ar[i]);
					
				}
				
			}
			
		}

	}

}
