package tapPatterns;

public class TwentyFiveCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		
	
		//pattern1(n);
		
		pattern2(n);
	}
	
	
	static void pattern1(int n) {
		
//		01 02 03 04 05 
//		06 07 08 09 10 
//		11 12 13 14 15 
//		16 17 18 19 20 
//		21 22 23 24 25 
		
		int count=1;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				
				if(count<10) {
					System.out.print("0");
				}
				System.out.print(count+" ");
				count++;
			}
			
			System.out.println();
		}
	}
	
	

	private static void pattern2(int n) {
		
//		01 02 03 04 05 
//		02 04 06 08 10 
//		03 06 09 12 15 
//		04 08 12 16 20 
//		05 10 15 20 25 
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i*j<10) {
					System.out.print("0");
				}
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
		
	}

}
