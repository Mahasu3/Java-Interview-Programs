package Strings;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "india is my country";
		
		//task1(str);//aidni si ym yrtnuoc
		//task2(str);//country my is india 
		//task3(str);//country7 my2 is2 india5
		evenodd(str);
	}

	private static void evenodd(String str) {
		
		String[] split = split(str);
		
		for(int i=1,j=0;i<split.length&&j<split.length;i+=2,j+=2) {
			
			if(i<split.length-1 &&j<split.length-1) {
			System.out.print(split[i]+" "+split[j]+" ");
			}
			else {
				System.out.print(split[i]+" "+split[j]);
			}
			
		}
		
		
//		for(int i=0;i<split.length;i+=2) {
//			System.out.print(split[i]+" ");
//		}
		
		
	}

	private static void task3(String str) {

		String res="";
		//int sum=0;
		
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				count++;
				res+=str.charAt(i);
			}
			else {
				res=res+count+" ";
				count=0;
			}
		}
		res=res+count;
		
		String[] split = split(res);
		
		for(int i=split.length-1;i>=0;i--) {
			System.out.print(split[i]+" ");
		}
		
		
	}

	private static void task2(String str) {

		String[] split = split(str);
		
		for(int i=split.length-1;i>=0;i--) {
			System.out.print(split[i]+" ");
		}
	}

	

	private static void task1(String str) {
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		String[] split = rev.split(" ");
		rev="";
		
		for(int i=split.length-1;i>=0;i--) {
			if(i!=0) {
			rev+=split[i]+" ";
			}
			else {
				rev+=split[i];
			}
		}
		
	System.out.println(rev);
		
		}
	
	
	
	
	
	
	private static String[] split(String str) {
		String[] res=new String[str.length()];
		int ind=0;
		String out="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				out+=str.charAt(i);
			}
			else {
				res[ind++]=out;
				out="";
			}
		}

		res[ind++]=out;
		
		String[] res2=new String[ind];
		
		for(int i=0;i<ind;i++) {
			res2[i]=res[i];
		}
		
		return res2;
	}
	

}
