package Arrays;

import java.util.Scanner;

public class MissingNumber {// (only works for 1-9)

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		missingnumber(arr);
	}

private static void missingnumber(int[] arr) {
	
	int n=arr.length+1;
	int sum=0;
	 
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
	}
	System.out.println(sum);
	
	int sum2=n*(n+1)/2;
	System.out.println(sum2);
	
	System.out.println(sum2-sum);
}

}
