package Numbers;

import java.util.Scanner;

public class SpyNumber {  // sum of it's digits == product of it's digits

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m=n;
	int sum=0,prod=1;
	while(n!=0) {
		int d=n%10;
		sum+=d;
		prod*=d;
		n=n/10;
	}
	
	if(sum==prod) System.out.println("it is spy number");
	else System.out.println("not spy number");
		
	}

}
