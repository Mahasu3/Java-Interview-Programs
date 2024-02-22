package collections;

import java.util.Scanner;

public class Decryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		int k=sc.nextInt();
		
		decrypt(str,k);
	}

	private static void decrypt(String str,int k) {
		k=k%26;

		String res="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(ch>='a'&& ch<='z') {
				
				if(ch>='a'&& ch<='z'-k) {
					res+=(char)(ch+k);
				}
				else {
					res+=(char)(ch+k-26);
				}
			}
			else if(ch>='A' && ch<='Z') {
				if(ch>='A' && ch<='Z'-k) {
					res+=(char)(ch+k);
				}else {
					res+=(char)(ch+k-26);
				}
			}
			else {
				res+=ch;
			}
		}
		
		System.out.println(res);
	}

}
