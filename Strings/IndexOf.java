package Strings;

import java.util.Scanner;

public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		
		char ch=sc.next().charAt(0);
		
		index(str,ch);
	}

	static void index(String str,char ch) {
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)==ch) {
				System.out.println(i);
			}
		}
	}
}
