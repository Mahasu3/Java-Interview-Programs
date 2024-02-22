package Numbers;

import java.util.Scanner;

public class PrintNumbersDifferent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      Scanner s = new Scanner(System.in);
	      
	      int n=s.nextInt();
	        
	      int m=n;
	      
	      while(n!=0) {
	    	  
	    	  int d=n%10;
	    	  System.out.println(d);
	    	     n=n/10;
	      }
	      
	}

}
