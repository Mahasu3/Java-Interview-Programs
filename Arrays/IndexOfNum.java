package Arrays;

import java.util.Scanner;

public class IndexOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int k=sc.nextInt();
		
		indexofnum(arr,k);
	}

	private static void indexofnum(int[] arr, int k) {
		
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]==k) System.out.println(i);
        }
		
	}

}
