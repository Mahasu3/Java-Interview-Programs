package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Picnic {//no.of groups formed in picnic 
// the group is safe it has two members same compatability
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//groups(arr);//rule:any two members should have same compantability
		groups2(arr);//rule:any four members should have same compantability

	}


	private static void groups(int[] arr) {

		HashSet<Integer> set = new HashSet<Integer>();
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			
			if(set.contains(num)) {
				count++;
				set.clear();
			}
			else {
				set.add(num);
			}
		}
		
		System.out.println(count);
	}
	
	
	
	private static void groups2(int[] arr) {

		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
	
	
	int groups=0;
	
	for(int i=0;i<arr.length;i++) {	
		
		if(map.containsKey(arr[i]) ) {
		   int c=map.get(arr[i]);
		   if(c==3) {
			   groups++;
			   map.clear();
		   }
		   else {
			   map.put(arr[i], c+1);
		   }
		 
		}
		else {
			map.put(arr[i], 1);
		}
	}
	
	System.out.println(groups);
	}

}
