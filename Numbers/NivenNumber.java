package Numbers;

import java.util.Scanner;

//also called as Harshad Number
public class NivenNumber {// a no. which is divisible by sum its number

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m=n;
		int sum=0;
		while(n!=0) {
			
			int d=n%10;
			sum+=d;
			n=n/10;
		}
		
		if(m%sum==0)System.out.println("harshad number");
		else System.out.println("not a harshad number");
	}

}
