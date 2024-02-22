package Strings;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		
		duplicates(str);
	}

	private static void duplicates(String str) {

		char[] cha = str.toCharArray();
		
		boolean[] flag=new boolean[cha.length];
		
		String res="";
		
		for(int i=0;i<cha.length;i++) {
			if(!flag[i]) {
				for(int j=i+1;j<cha.length;j++) {
					if(cha[i]==cha[j]) {
						flag[j]=true;
					}
				}
				res+=cha[i];
			}
		}
		
		System.out.println(res);
	}

}
