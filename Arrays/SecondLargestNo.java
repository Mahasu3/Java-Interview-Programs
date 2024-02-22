package Arrays;

import java.util.Scanner;

public class SecondLargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		first_2ndmax(arr);
	}

	private static void first_2ndmax(int[] arr) {
		int max=Integer.MIN_VALUE;
		int p=0,vp=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>p) {
				vp=p;
				p=arr[i];		
			}
			else if(arr[i]<p && arr[i]>vp) {
				vp=arr[i];
			}
		}
		System.out.println(p+" "+vp);
		
	}

}
