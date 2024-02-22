package Strings;

import java.util.Scanner;

public class LongestPalidrSubstr {
	
//	mississippibbibbi
//	ississi
//	ibbibbi
	
	//since there are two highest plaindromes of same size


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str=sc.next();
		
		longestpalinsub(str);
		

	}

	private static void longestpalinsub(String str) {

	for(int len=str.length()-1;len>=0;len--) {
		int count=0;
		for(int i=1;i<=str.length()-len;i++) {
			String res="";
			for(int j=i;j<len+i;j++) {
				 res+=str.charAt(j);
			}
			
			
			if(ispalindrom(res)) {
				System.out.println(res);
				return;
			
			}
			
		}
		
		
	}
	
	
	
	
	
	
	}

	private static boolean ispalindrom(String res) {
		// TODO Auto-generated method stub
		
		for(int i=0,j=res.length()-1;i<j;i++,j--) {
			if(res.charAt(i)!=res.charAt(j)) {
				return false;
			}
		}
		return true;
	}
}