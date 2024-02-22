package Strings;

import java.util.Scanner;

public class AddNumsAtEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String str=sc.next();
		
		add(str);
	}

	private static void add(String str) {

		String res="";
		int sum=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(ch>='0'&& ch<='9') 
			{
				sum+=ch-'0';
			}
			
			else {
				res+=ch;
			}
		}
		
		System.out.println(res+sum);
	}

}
