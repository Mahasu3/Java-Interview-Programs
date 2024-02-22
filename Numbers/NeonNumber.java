package Numbers;

import java.util.Scanner;

public class NeonNumber {//where sum of it's digits of square of a number is == original number

	//9 9*9 = 81 -->8+1=9
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		 int n=scan.nextInt();
		 int m=n;
		 int sum=0;
		 n=n*n;
		 while(n!=0){
			 int d=n%10;
			 sum+=d;
			 n=n/10;
		 }
		 
		 if(sum==m)System.out.println("neon");
		 else System.out.println("not neon");
		 
	}

}
