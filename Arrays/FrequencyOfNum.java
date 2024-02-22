package Arrays;

import java.util.Scanner;

public class FrequencyOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int k=sc.nextInt();
		
		frequency(arr,k);
	}

	private static void frequency(int[] arr, int k) {
		
		int count=0;
		for(int ele:arr) {
			if(ele==k) count++;
		}
		System.out.println(count);
		
	}

}
