package Numbers;

import java.util.Scanner;

public class DuckNumber {//a no. which has zeroes in it
	
	// this pro. also used for counting a particular numbers how many times it occured

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=n;
		int count=0;
		while(n!=0) {
			int d=n%10;
			if(d==0) count++;
			n=n/10;
		}
		if(count>0)System.out.println("duck number");
		else System.out.println("not duck number");

}
}
