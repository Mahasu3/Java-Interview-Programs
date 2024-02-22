package Strings;

import java.util.Scanner;

public class RmoveUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		remove(str);
	}

	private static void remove(String str) {

		String res="";
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(!(ch>='A'&&ch<='Z')) {
				res+=ch;
			}
		}
		
		System.out.println(res);
	}

}
