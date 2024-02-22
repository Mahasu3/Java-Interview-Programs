package Numbers;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          
          int n=sc.nextInt();
          
//          fibonacciSeries(n);
          
        int res= nTHfib(n);
         System.out.println(res);
	}

	

	private static void fibonacciSeries(int n) {
		
	
		int n1=0,n2=1;
		if(n<=1) System.out.println(n);
		for(int i=2;i<=n;i++) {
			int temp=n1+n2;
			n1=n2;
			n2=temp;
			System.out.println(n2);
		}
		
	}
	
	private static int nTHfib(int n) {
		
		 if(n<=1) return n;
		 
		return nTHfib(n-1)+nTHfib(n-2);
		
	}

}
