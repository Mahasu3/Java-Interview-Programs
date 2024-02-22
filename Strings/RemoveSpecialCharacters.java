package Strings;

import java.util.Scanner;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		
		remove(str);
	}

	private static void remove(String str) {

		String res="";
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(ch>='a'&&ch<='z'
				|| ch>='A'&&ch<='Z'
					|| ch>='0'&&ch<='9'){
						
						res+=ch;
					}
			else {
				res+="";
			}
		}
		
		System.out.println(res);
	}

}
