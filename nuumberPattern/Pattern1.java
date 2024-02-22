package nuumberPattern;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		pattrn1(n);
	}

	private static void pattrn1(int n) {
		
		for(int i=1,p=1;i<=n;i++,p++) {
			for(int j=1;j<=i;j++) {
				System.out.print(p);
			}
			System.out.println();
		}
		
	}

}
