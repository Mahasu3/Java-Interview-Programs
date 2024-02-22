package Arrays;

import java.util.Scanner;

public class LongestNonReapeatingNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
	    int [] arr=new int[n];
	    for(int i=0;i<arr.length;i++) {
	    	arr[i]=in.nextInt();
	    }
	    
	    highestNonRepeatingNo(arr); // non-consecutive number
	    
//	    highestRepeatingNo(arr); // consecutive no
	}

	private static void highestRepeatingNo(int[] arr) {
		
		int max=Integer.MIN_VALUE;
		int res=0;
		int count=1;
		
		int i=0;
		for( ;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				
				count++;
			}
			else {
				if(count>max) {
					max=count;
					res=arr[i];
					count=1;
					
				}
			}
		}
		
		if(count>max) {
			max=count;
			res=arr[i];
		}
		
		System.out.println(max);
		System.out.println(res);
		
		
	}

	private static void highestNonRepeatingNo(int[] arr) {
		int max=Integer.MIN_VALUE;
		
		int[] res=new int[2];
		
		for(int i=0;i<arr.length;i++) {
			
			int count=1;
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			
			if(count>max) {
				max=count;
				res[0]=arr[i];
				
			}
		}
		
		System.out.println(res[0]);
		System.out.println(max);
	}

}
