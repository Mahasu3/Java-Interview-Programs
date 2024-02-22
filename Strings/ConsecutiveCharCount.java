package Strings;

import java.util.Scanner;

public class ConsecutiveCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		String str=s.nextLine();
		
		int count=1;
		int max=Integer.MIN_VALUE;

		char c = 0;
		
		char ch = 0;
		
		for(int i=0;i<str.length()-1;i++) {
			
		ch=str.charAt(i);
			
			if(ch==str.charAt(i+1) ) {
				count++;
				
			}
			else {
				if(count>max) {
					max=count;
					c=ch;
					count=1;
					
				}
			}
			
			
		}
		if(count>max) {
			max=count;
			c=ch;
			
		}
		
		System.out.println(c+" "+max);
		
	}
	
	
	

	
}
