package Arrays;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];

		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		rotatearray(arr);
		
		for(int res:arr) {
			System.out.print(res+" ");
		}
		
		
	}

	private static void rotatearray(int[] arr) {
		int len=arr.length;
		int firstindex=0;
		int lastindex=len-1;
		
		for(int i=0;i<len/2;i++) {
			int temp=arr[firstindex];
			arr[firstindex]=arr[lastindex];
			arr[lastindex]=temp;
			firstindex++;
			lastindex--;
			
			
		}
		
		
		
	}

}
