package Numbers;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner sc = new Scanner(System.in); 
		
		int n=sc.nextInt();
		
		
//		first_way(n);
		
//		second_way(n);
		
		efficient_way(n);
		
		
	}

	private static void efficient_way(int n) {
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println("not prime");
			    break;
			}
			else {
				System.out.println("prime");

			}
			
		}
		
		
	}

	private static void second_way(int n) {
		int count=0;
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)count++;
		}
		
		if(count==0) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
	}

	
	
	
	private static void first_way(int n) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) count++;
		}
		
		if(count==2) System.out.println("prime");
		else System.out.println("not prime");
	}
}
