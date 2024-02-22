package patterns;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
//		1 1 1 1 1 
//		2 2 2 2 2 
//		3 3 3 3 3 
//		4 4 4 4 4 
//		5 5 5 5 5 
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println("other pattern started");
		
		for(int i=0;i<n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
