package Arrays;

import java.util.Scanner;

public class ShortHandGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		 
		shortHandGenerator(arr);
		
	}

	private static void shortHandGenerator(int[] arr) {
		// TODO Auto-generated method stub
		
		int count=1;
		String res= "";
		
		int i=0;
		for(;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				count++;
			}
			else {
				res+=res+arr[i]+count;
				count=1;
			}
		
		}
		
		res=res+arr[i]+count;
		
		System.out.println(res);
	}

}
