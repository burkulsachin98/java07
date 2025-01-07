package logical.programs;

public class Armstrong_Number {

	public static void main(String[] args) {

		int no=153;
		int temp=no;
		int arm=0;
		int mod;
		while(no>0) {
			mod=no%10;
			arm=mod*mod*mod+arm;
			no=no/10;

		}
		System.out.println(arm);

		if(temp==arm) {
			System.out.println("No is Armstrong number");

		}else {
			System.out.println("No is not an armstromng number");
		}
	}

}
