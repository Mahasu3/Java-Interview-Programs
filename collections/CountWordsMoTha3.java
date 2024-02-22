package collections;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CountWordsMoTha3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		countwords(s);
	}

	private static void countwords(String s) {

    String[] arr = s.split(" ");
    
    HashMap<String, Integer> map = new HashMap<String,Integer>();
		
		for(int i=0;i<arr.length;i++) {
			String str=arr[i];
			
			if(map.containsKey(str)) {
				
				int c = map.get(str);
				map.put(str, c+1);
				
			}
			else {
				map.put(str, 1);
			}
			
		}
		
		Set<String> keys = map.keySet();
		
		for(String words:keys) {
			if(map.get(words)>3) {
				System.out.println(words);
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
