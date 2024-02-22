package Strings;

import java.util.Scanner;

public class SubstrAndPalindr {

	public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        String str=sc.next();
	        int size=sc.nextInt();
	        
	        substring(str,size);
	}

	private static void substring(String str, int len) {

		
		for(int i=0;i<=str.length()-len;i++) {
			
			String t="";
			for(int j=i;j<i+len;j++) {
				//System.out.print(str.charAt(j));
				t+=str.charAt(j);
			}
			
		//System.out.println();
			
			if(ispalindrome(t)) {
				System.out.println(t);
			}
			
		}
	}
	
	
	static boolean ispalindrome(String str) {
		
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		
		
		return(rev.equals(str))?true:false;
	}

}
