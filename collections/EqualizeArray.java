package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class EqualizeArray {//minimum no.of deletions required
	                         // to leave equal vlaues in an array
	   

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		equalizeArray(arr);
		
	}

	private static void equalizeArray(int[] arr) {

		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
	
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			if(map.containsKey(num)) {
				int c = map.get(num);
				map.put(num, c+1);
			}
			else {
				map.put(num,1);
			}
		}
			
		
		Collection<Integer> val = map.values();
	
		int max=0;
		for(int ele:val) {
			if(ele>max) {
				max=ele;
			}
		}
	
		System.out.println(arr.length-max);
	
	}

}
