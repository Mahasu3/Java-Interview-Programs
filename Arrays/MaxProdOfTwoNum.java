package Arrays;

import java.util.Scanner;

public class MaxProdOfTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int prod1 =maxNums(arr);
		
		int prod2=minNums(arr);
		
		
		if(prod1>prod2) System.out.println(prod1);
		else System.out.println(prod2);
		
	}

	

	private static int maxNums(int[] arr) {
		
		int fl=Integer.MIN_VALUE;
		int sl=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>fl) {
				sl=fl;
				fl=arr[i];
			}
			else if(arr[i]<fl && arr[i]>sl) {
				sl=arr[i];
			}
		}
		return fl*sl;
		
	}
	
	private static int minNums(int[] arr) {
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min1) {
				min2=min1;
				min1=arr[i];
			}
			else if(arr[i]<min2 && arr[i]>min1) {
				min2=arr[i];
			}
		}
		
	
		return min1*min2;
	}
	
	

}
