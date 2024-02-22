package collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt(); 
		
		
		HashMap<String, String> map = new HashMap<String,String>();
		
		for(int i=0;i<n;i++) {
			map.put(sc.next(), sc.next());
			
			//india telugu uk english 
			//uae arabic usa english
		}
		
		
Set<Entry<String, String>> es = map.entrySet();
for(Entry<String, String> ele:es) {
		
	System.out.println(ele);
	
//	        usa=english
//			uk=english
//			uae=arabic
//			india=telugu
	}

System.out.println();

     Set<String> ks = map.keySet();
     
     for(String ele:ks) {
    	 System.out.println(ele+" "+map.get(ele));
//    	 usa english
//    	 uk english
//    	 uae arabic
//    	 india telugu

     }

}
}
