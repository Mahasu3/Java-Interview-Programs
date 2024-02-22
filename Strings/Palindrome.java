package Strings;

import java.util.Scanner;

class Palindrome{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		
		//isPalindrome(str);
		
		
		
		/*WAY-2
		 *         TENET
		 *         
		 *         starting and ending char is same and 
		 *         starting second char and ending second char are same
		 *          and vice versa up to the middle
		 */
		boolean pc = isPalindromeway2(str);
		if(pc) System.out.println("palindrome");
		else System.out.println("not palindrome");
	}

	private static boolean isPalindromeway2(String str) {
		int n=str.length();
		
		boolean res=false;
		
		for(int i=0;i<=n/2;i++) {
			if(str.charAt(i)!=str.charAt((n-i)-1)) {
				return false;
			}
			
						
		}
		
	return true;	
	}

	private static void  isPalindrome(String str) {
		
		
		String rev =reverse(str);
	
		String res=(str.equals(rev))?"palindrome":"not palindrome";
		
		System.out.println(res);
		
	}

	private static String reverse(String str) {
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		
		return rev;
	}
	
	
	
	
	/*Alternative way
	 * 
	 * boolean ispalindrome(String res)
	 *{
	 *  for(int i=0,j=str.length()-1;i<j;i++,j--)
	 *  {
	 *     if( str.charAt(i) != str.charAt(j) )
	 *      {
	 *          return false;
	 *      }
	 *  }
	 *     return true;
	 *}    
	 */
	

}