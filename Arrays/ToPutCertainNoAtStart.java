package Arrays;

import java.util.Scanner;

public class ToPutCertainNoAtStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		atStartofAnArray(arr);
	}

	private static void atStartofAnArray(int[] arr) {
		
		int i=arr.length-1;
		int j=arr.length-1;
		
		while(j>=0) {
			if(arr[j]==-1) {
				j--;
			}
			else {
				arr[i--]=arr[j--];
			}
		}
		while(i>=0) {
			arr[i]=-1;
			i--;
		}
		
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
	}

}
