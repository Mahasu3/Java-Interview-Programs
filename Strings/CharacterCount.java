package Strings;

import java.util.Scanner;

public class CharacterCount{
	
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String str=in.nextLine();
	
		
		charcterCount(str);
	}

	private static void charcterCount(String str) {
		
		
		char[] ch = str.toCharArray();
		int len=ch.length;
		 boolean[] flag=new boolean[len];
		 
		
		
			for(int i=0;i<len;i++) {
				if(!flag[i]) {
					int count=1;
					for(int j=i+1;j<len;j++) {
						if(ch[i]==ch[j]) {
							flag[j]=true;
							count++;
						}
					}
					
					System.out.println(ch[i]+" ");
				}
		
		
		
		}
		}
		
	
	
	
}