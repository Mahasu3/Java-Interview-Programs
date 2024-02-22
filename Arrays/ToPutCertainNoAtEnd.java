package Arrays;

import java.util.Scanner;

public class ToPutCertainNoAtEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		toEnd(arr);
	}

	private static void toEnd(int[] arr) {

		int i=0;
		int j=0;
		
		while(j<arr.length) {
			if(arr[j]==0) {
				j++;
			}
			else {
				arr[i++]=arr[j++];
				
			}
		}
		
		while(i<arr.length) {
			arr[i++]=0;
			
		}
		
		for(int ele:arr) {
		 System.out.print(ele+" ");
		}
	}

}
