package Numbers;

import java.util.Scanner;

public class AutomorphicNumber {
//A number which is contained in last digits of it's square 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m=n;
		int flag=0,q=n*n;
		
		while(n!=0) {
			int d=n%10;
			int d1=q%10;
			if(d!=d1) flag=1;
			n=n/10;
			q=q/10;
		}
		  
		if(flag==0) System.out.println("automorphic number");
		else System.out.println("automorphic number");
	}

}
