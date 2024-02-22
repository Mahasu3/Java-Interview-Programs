package patterns;

import java.util.Scanner;

public class DecreasingTriangle {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.close();
		
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
