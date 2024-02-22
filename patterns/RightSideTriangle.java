package patterns;

import java.util.Scanner;

public class RightSideTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
 
