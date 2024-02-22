package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class NoOfPairs {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		
		pairs(str);
	}

	private static void pairs(String str) {

	HashMap<Character, Integer> map = new HashMap<Character,Integer>();
	
	
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(map.containsKey(ch)) {
			int c=map.get(ch);
			map.put(ch, c+1);
		}
		else {
			map.put(ch,1);
		}
	}
	
	 Collection<Integer> values = map.values();
	 int pairs=0;
	 
	 for(int num:values) {
		 pairs=pairs+num/2;
	 }
	 
	 System.out.println(pairs);
	 
	}
}
