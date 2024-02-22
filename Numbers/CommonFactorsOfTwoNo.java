package Numbers;

import java.util.Scanner;

public class CommonFactorsOfTwoNo {
	
	// factor: if a no x divides the given no y without leaving 
	// remainder the x is a factor of y 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		
		
//		int[] out =commonFactors(n,m);
//		for(int i=0;i<out.length;i++) {
//			if(out[i]!=0) {
//				System.out.print(out[i]+" ");
//			}
//		}
		
		System.out.println(hcf(m,n));
		
		
}
	
	
	public static int hcf(int m,int n) {
		
		for(int i=n;i>=1;i--) {
			if(n%i==0 && m%i==0) {
				return i;
			}
		}
		
	return -1;	
	}
	
	
	
	
	static int[] commonFactors(int n,int m) {

	    int size=(n<m)?n:m;
		
		int[] res=new int[n];
		int ind=0;
		
		for(int i=1;i<=size;i++) {
			if(n%i==0 && m%i==0) {
			
			res[ind++]=i;
			}
		}
		
		return res;
	}
}
