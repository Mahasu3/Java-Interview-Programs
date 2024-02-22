package patterns;

public class NumberPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if(i==j && i<=n/2+1 || i+j==n+1 &&i<=n/2) {
//						System.out.print(i);
//					}
//				 
//				 
//				 if(i>=n/2 && i+j==n+1 && j<=n/2 ) {
//					 System.out.print(j);
//				 }
//				 
//				 if(i>n/2 && j>n/2&& i==j) {
//					 System.out.print(n-(i-1));
//				 }
//				
//				
//					System.out.print(" ");
//			
//				}
//		
//			System.out.println();
//		}
		
		 //xshapedumbers(n);
		xshapedNumbers2(n);
			
	}
		
       

	private static void xshapedumbers(int n) {
		
		
		        
		        for (int i = 1; i <= n; i++) {
		            for (int j = 1; j < n; j++) {
		                if (j == i || j == n - i + 1) {
		                    System.out.print(j);
		                } else {
		                    System.out.print(" ");
		                }
		            }
		            System.out.println();
		        }
		    

	}



	private static void xshapedNumbers2(int n) {
		
		
		       for(int i=1;i<=n;i++) {
		    	   for(int j=1;j<=n;j++) {
		    		   
		    		   if((i==j && i<n/2 && j<n/2) || 
		    				   (i+j==n+1 && j>n/2 && i<n/2)) {
				    	   
		    			    System.out.print(i+" ");
				       }
		    		   else if(i>n/2 && j<n/2 && i+j==n+1) {
		    			   System.out.print(j+" ");
		    		   }
		    		   else if(j>n/2+1 && i>n/2 && i==j) {
		    			   System.out.print(n-(i-1)+" ");
		    		   }
//		    		   else if(i<n/2 && i>n/2 && j<n/2 && j>n/2) {
//		    			   System.out.print(n/2);
//		    		   }
		    		   else  {
		    			   System.out.print("  ");
		    		   }
		    	   }
		    	   
		    	   System.out.println();
		       }
		    }
		

		
	

//	private static void xshapedNumbers(int n) {
//		
//     int count = 0;
//		
//		for (int i = 0; i < n; i++)
//		{
//			for (int j = 0; j < n; j++)
//			{
//				if (i == j && i <= n / 2 && j <= n / 2)
//				{
//					System.out.print(n - j);
//					count = n - j;
//				} 
//				else if (i == j && i > n / 2 && j > n / 2) 
//				{
//					System.out.print(++count);
//				} 
//				else if (i == n - j - 1 && i <= n / 2 && j >= n / 2) 
//				{
//					System.out.print(i + 1);
//				} 
//				else if (i == n - j - 1 && i > n / 2 && j < n / 2) 
//				{
//					System.out.print(j + 1);
//				} 
//				else 
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//	}

}

