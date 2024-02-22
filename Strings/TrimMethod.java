package Strings;

import java.util.Scanner;

public class TrimMethod {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		
		trim(str);
	}

	private static void trim(String str) {

		int si=0;
		int ei=0;
		String res="";
		
		for(int i=0;i<str.length();i++) {
			if(!(str.charAt(i)==' ')) {
				si=i;
				break;
			}
		}
		
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i)!=' ') {
   
				ei=i;
				break;
				
			}
		}
		
		System.out.println(si);
		System.out.println(ei);
		
		
		for(int i=si;i<=ei;i++) {
			
			res+=str.charAt(i);
		}
		
		System.out.println(res);
	}

}
