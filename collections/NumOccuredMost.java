package collections;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class NumOccuredMost {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		mostOccured(arr);
	}

	private static void mostOccured(int[] arr) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();

		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			if(map.containsKey(num)) {
				int c= map.get(num);
				map.put(num, c+1);
			}
			else {
				map.put(num, 1);
			}
			
		}
		
		Set<Integer> keys = map.keySet();
		int max=0;
		int maxkey=0;
		for(int key:keys) {
			if(map.get(key)>max) {
				max=map.get(key);
				maxkey=key;
			}
		}
		
		System.out.println(maxkey);
	}

}
