package collections;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class CountCharacters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		
		count(str);
	}

	private static void count(String str) {
		
 LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character,Integer>();
		
 
       for(int i=0;i<str.length();i++) {
    	   char ch=str.charAt(i);
    	   
    	   if(map.containsKey(ch)) {
    		   int c = map.get(ch);
    		   map.put(ch, c+1);
    	   }
    	   else {
    		    map.put(ch, 1);
    	   }
       }
       
       
     Set<Character> keys = map.keySet();
     
     for(char ch:keys) {
    	 System.out.println(ch+" "+map.get(ch));
     }
       
	}

}
