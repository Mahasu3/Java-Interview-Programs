package Strings;

import java.util.Scanner;

public class SplitMethod {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str=sc.nextLine();
		
		split(str);
		
		split2(str);// here it returns resultant array
	}

	static String[] split2(String str2) {
		  String[] res=new String[str2.length()];
		  String temp="";
		  int ind=0;
		  
		  for(int i=0;i<str2.length();i++) {
			  char ch=str2.charAt(i);
			  
			  if(ch!=' ') {
				  temp+=ch;
			  }
			  else {
				 res[ind++]= temp;
				 temp="";
			  }
		  }
		  
		  res[ind++]= temp;
		  
		  String[] res2=new String[ind];
		  
		    System.arraycopy(res, 0, res2, 0, ind);  
		  
		  return res2;
	  }


	
	
	
	
	private static void split(String str) {

		String[] res=new String[str.length()];
		String out="";
		int ind=0;
		int i=0;
		
		while(i<str.length()) {
			
			if(str.charAt(i)!=' ') {
				out=out+str.charAt(i);
				i++;
			}
			else {
				res[ind++]=out;
				out="";
				i++;
			}
		}
		
		res[ind++]=out;
		
for(int i1=0;i1<ind;i1++) {
			
			System.out.print(res[i1]+" ");
		}
	}

}
