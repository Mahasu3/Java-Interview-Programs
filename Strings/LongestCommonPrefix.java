package Strings;
//
import java.util.Scanner;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		
		String[] strs=new String[n];
		for(int i=0;i<n;i++) {
			strs[i]=in.nextLine();
			
			}
		
		
		
		String res=longestPrefix(strs);
		
		System.out.println(res);
		
		

	}

	static String longestPrefix(String[] strs) {
		
		int len=strs[0].length();
		
		
		
		for(int i=1;i<strs.length;i++) {
			len=Math.min(len, strs[i].length());
			
			for(int j=0;j<len;j++) {
			char c=strs[0].charAt(j);
			char d=strs[i].charAt(j);
			
			if(c!=d) {
				len=j;
				break;
			}
			}
			
		}
		
	
		return strs[1].substring(0, len);
	}

}



//public class LongestCommonPrefix {
//    public static void main(String[] args) {
//    	Scanner sc = new Scanner(System.in);
//    	int n=sc.nextInt();
//    	sc.nextLine();
//    	
//        String[] strs = new String[n];
//        for(int i=0;i<strs.length;i++) {
//        	strs[i]=sc.nextLine();
//      
//        }
//        for(String res:strs) {
//        	
//        	System.out.println(res);
//        }
//        String prefix = longestCommonPrefix(strs);
//        System.out.println("1");
//        System.out.println(prefix);
//    }
//
//    public static String longestCommonPrefix(String[] strs) {
//        if (strs == null || strs.length == 0) {
//            return "";
//        }
//        String prefix = strs[0];
//        for (int i = 1; i < strs.length; i++) {
//            while (strs[i].indexOf(prefix) != 0) {
//                prefix = prefix.substring(0, prefix.length() - 1);
//                if (prefix.isEmpty()) {
//                    return "";
//                }
//            }
//        }
//        return prefix;
//    }
//}
//
