package Arrays;

import java.util.Scanner;

public class PairsWhoseSumIsK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		pairs(arr);
	}

	private static void pairs(int[] arr) {
		int k=6;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]+arr[j]==k) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}

}
