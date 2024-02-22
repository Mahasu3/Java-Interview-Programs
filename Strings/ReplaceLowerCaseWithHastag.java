package Strings;

import java.util.Scanner;

public class ReplaceLowerCaseWithHastag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		
		replace(str);
	}

	private static void replace(String str) {

		String res="";
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(ch>='a' && ch<='z') {
				res+="#";
			}
			else {
				res+=ch;
			}
		}
		
		System.out.println(res);
	}

}
