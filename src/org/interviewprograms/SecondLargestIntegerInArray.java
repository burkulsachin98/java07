package org.interviewprograms;

public class SecondLargestIntegerInArray {

	public static void main(String[] args) {
		
		int ar[]= {3,5,6,4};
		int temp;
		
		for(int i=0;i<ar.length;i++) {
			for (int j=i+1;j<ar.length;j++) {
				
				if(ar[i]<ar[j]) {
					
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;	
				}
			}
		}
		System.out.println(ar[1]);
	}
}


