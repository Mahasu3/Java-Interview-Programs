package Strings;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		
		String [] words=new String[n];
		
		for(int i=0;i<words.length;i++) {
			words[i]=scan.next();
		}
		
		
		countWords(words);
		
	}

	private static void countWords(String[] words) {
		       
		int count=0;
	  for(int i=0;i<words.length-1;i++) {	
		  if(words[i]==" ") {
			  count++;
		  }
	  }
	  
	  
	  System.out.println(count+1);
		
	}

}
