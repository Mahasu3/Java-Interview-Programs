package Strings;

import java.util.Scanner;

public class ReverseWithoutUsingReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String str=in.nextLine();
		
		char [] ch=str.toCharArray();
		
		System.out.println("reverse string using rev for loop");
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]+" ");
		}
		
		
		System.out.println();
		
		reverseUsingReverse(str);
		
		reverseUsingSplit(str);
	}

	
	


	private static void reverseUsingReverse(String str) {
		
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		
		sb=sb.reverse();
		System.out.println("this is using the reverse function");
		System.out.print(sb);
	}
	
	
	private static void reverseUsingSplit(String str) {
		
		String[] tokens = str.split("");
		
		
		System.out.printf( "%nusing split method%n");
		
		for(int i=tokens.length-1;i>=0;i--) {
			System.out.printf(tokens[i]+" ");
		}
		
	}
	
	
	

}
