package collections;

import java.util.Scanner;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s = new Scanner(System.in);
		String str=s.next();
		
		TreeSet<Character>l=new TreeSet<Character>();
		
		for(int i=0;i<str.length();i++) {
			l.add(str.charAt(i));
		}
		
		for(char ele:l) {
			System.out.print(ele+" ");
		}
		
	}

}
