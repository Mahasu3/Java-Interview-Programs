package Arrays;

import java.util.Scanner;

public class SubArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
	//int size=sc.nextInt();
////		subarray(arr,size);
//		
//		countSubArraySumIsK(arr,size);
		
//		subArrayOfSizeKWhoseSumIsMax(arr,size);
		
		//maxValuesAllSubArrays(arr,size);
		
		//subArrayOfAllSize(arr);
		
		
		LongestConsecutiveSubArray(arr);
		

	}

	
	private static void LongestConsecutiveSubArray(int[] arr) {
		int start=0;
		int end=0;
		int si=0;
		int ei=0;
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i+1]-arr[i]==1) {
				ei++;
			}
			else {
				
				if(ei-si>end-start) {
					start=si;
					end=ei;
				}
				
				si=i+1;
				ei=i+1;
			}
		}
		if(ei-si>end-start) {
			start=si;
			end=ei;
		}
		
		for(int i=start;i<=end;i++) {
			System.out.println(arr[i]);
		}
	}



	private static void subArrayOfAllSize(int[] arr) {
		
		for(int k=0;k<arr.length;k++) {
			for(int i=0;i<arr.length-k;i++) {
				for(int j=i;j<k+i;j++) {
					System.out.print(arr[j]+" ");
				}
				System.out.println();
			}
		}
		
	}



	private static void maxValuesAllSubArrays(int[] arr, int size) {
		
		for(int i=0;i<arr.length-size;i++) {
			int max=Integer.MIN_VALUE;
			for(int j=i;j<size+i;j++) {
				//System.out.print(arr[j]+" ");
				if(arr[j]>max) {
					max=arr[j];
				}
			}
			
			System.out.println(max);
		}
		
	}



	private static void subArrayOfSizeKWhoseSumIsMax(int[] arr, int size) {
		
		int max=Integer.MIN_VALUE;
		int maxStart=0;
		
		for(int i=0;i<arr.length-size;i++) {
			int sum=0;
			for(int j=i;j<size+i;j++) {
				sum+=arr[j];
			}
			
			if(sum>max) {
				max=sum;
				maxStart=i;
			}
		}
		for(int i=maxStart;i<maxStart+size;i++) {
			System.out.println(arr[i]);
		}
		
	}



	private static void subarray(int[] arr, int size) {
		
		
		for(int i=0;i<arr.length-size;i++) {
			int sum=0;
			for(int j=i;j<size+i;j++) {
				System.out.print(arr[j]+" ");
				sum+=arr[j];
			}
			
		   System.out.println("sum is"+sum);
		   System.out.println("average is"+sum/size);
			System.out.println();
			
			
		}
	}
		
		
		private static void countSubArraySumIsK(int[] arr, int size) {
			
			int k=6;
			int count=0;
			for(int i=0;i<arr.length-size;i++) {
				
				int sum=0;
				for(int j=i;j<size+i;j++) {
					sum+=arr[j];
				}
				if(sum==k) count++;
				
			}
			System.out.println(count);
			
		
		
		
	}
	
	
	
	
	
	
	
	

}
