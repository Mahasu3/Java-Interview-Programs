package patterns;

public class Important{
	
	public static void main(String[] args) {
		
		
		int n=5;
		for(int i=0;i<=n;i++) {
			
			for(int j=0;j<i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		
for(int i=0;i<=n;i++) {
			
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}


for(int i=0;i<=n;i++) {
	
	for(int j=i;j<n;j++) {
		System.out.print("  ");
	}
	
	for(int j=0;j<i;j++) {
		System.out.print("* ");
	}
	
	for(int j=0;j<i-1;j++) {
		System.out.print("* ");
	}
	
	System.out.println();
	
}

int size=n*2;

for(int i=1;i<=n;i++) {
	for(int j=1;j<size;j++) {
		if(j<size/2-1) {
			System.out.print("  ");
		}
		else if(j>=size/2 && j<(size/2)+3) {
			System.out.print("* ");
		}
	}
	System.out.println();
}


for(int i=1;i<=n;i++) {
	 for(int j=1; j<=i; j++){
		  
		  if(j==1 || j==i || i==n){
		     System.out.print(" *");  //print star, when the condiiton is true
		     }
		     else{
		     System.out.print("  ");
		}
		}
	 System.out.println();
	}
	
	
	
}


	}
