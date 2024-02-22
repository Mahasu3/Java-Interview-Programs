package collections;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Hashset{
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str=s.next();
		
		LinkedHashSet<Character>l=new LinkedHashSet<Character>();
		
		for(int i=0;i<str.length();i++) {
			l.add(str.charAt(i));
		}
		
		for(char ele:l) {
			System.out.print(ele+" ");
		}
		
		
	}
}