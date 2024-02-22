package Strings;

import java.util.Scanner;

public class VowlsCnsonantsNumsSpecial {

	public static void main(String[] args) {
		
    	Scanner sc = new Scanner(System.in);
    	
    	String str=sc.next();
    	
    	int n=str.length();
    	
    	countvowels(str,n);
}

	private static void countvowels(String st, int n) {

		int vow=0;
		int con=0;
		int nums=0;
		int spchar=0;
		String str = st.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
			{
				
				if(ch=='a'|| ch=='i'||ch=='o'||ch=='u'|| ch=='e') {
					vow++;
				}
				else {
					if(ch>='a' && ch<='z') {
						con++;
					}
				
				}
			}
			else if(ch>='0' && ch<='9') {
				nums++;
			}
			else {
				spchar++;
			}
		}

		System.out.println("vowels are"+vow);
		System.out.println("consonants are"+con);

		System.out.println("numbers are"+nums);
		System.out.println("special numbers are"+spchar);
	
}
}
