package Numbers;

import java.util.Scanner;

public class HcfOfArrayOfNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		hcfOfArray(arr);

	}

	 static void hcfOfArray(int[] arr) {
		 int hc=arr[0];
		for(int i=1;i<arr.length;i++) {
			
			hc=CommonFactorsOfTwoNo.hcf(hc,arr[i]);
		}
		System.out.println(hc);
	}
	
	
}
