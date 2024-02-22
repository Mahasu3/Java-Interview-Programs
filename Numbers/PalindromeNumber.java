package Numbers;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		int n=s.nextInt();
		
		int m=n;
		int sum=0;
		while(n!=0) {
			int d=n%10;
			sum=sum*10+d;
			n=n/10;
		}
		
		if(sum==m) System.out.println("palindrome");
		else System.out.println("not palindrome");
	
	}
			
			

}
	

