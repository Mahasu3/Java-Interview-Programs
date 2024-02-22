package Strings;

import java.util.Scanner;

public class LongestCommonSuffix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		String[] str=new String[n];
		
		for(int i=0;i<str.length;i++) {
			str[i]=sc.next();
		}
		
		suffix(str);
	}

	private static void suffix(String[] str) {

		int len=str[0].length();
		
		for(int i=1;i<str.length;i++) {
			len=Math.min(len, str[i].length());
			for(int j=len-1;j>=0;j--) {
				char c=str[0].charAt(j);
				char d=str[i].charAt(j);
				
				if(c!=d) {
					len=j;
					break;
				}
			}
		}
		System.out.println(str[0].substring(len+1,str[0].length()));
	}

}  
