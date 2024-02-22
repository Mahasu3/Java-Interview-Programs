package Arrays;

import java.util.Scanner;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int[] arr1 = new int[n1];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		
		
		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		
		merge(arr1,arr2); //result also in sorted order
		
		
		int n3 = sc.nextInt();
		int[] arr3 = new int[n3];
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = sc.nextInt();
		}
		
		merge(arr1,arr2,arr3);// results are not in sorted order 
	}

	

	private static void merge(int[] arr1, int[] arr2) {
		
		int[] res=new int[arr1.length+arr2.length];
		
		int i=0,j=0,k=0;
		
		while(i<arr1.length && j<arr2.length) {
		
			if(arr1[i]<arr2[j]) {
				res[k++]=arr1[i++];
			}
			else {
				res[k++]=arr2[j++];
			}
		}
		
		while(i<arr1.length) {
			res[k++]=arr1[i++];
		}
		
		while(j<arr2.length) {
			res[k++]=arr2[j++];
		}
		
		for(int ele:res) {
			System.out.print(ele+" ");
		}
		
		}
	
	
	
	private static void merge(int[] arr1, int[] arr2, int[] arr3) {
		
     int[] res=new int[arr1.length+arr2.length+arr3.length];
		
		int i=0,j=0;
		
		while(j<res.length) {
			
			if(i<arr1.length) {
				res[j++]=arr1[i];
			}
			
			if(i<arr2.length) {
				res[j++]=arr2[i];
			}
			
			if(i<arr3.length) {
				res[j++]=arr3[i];
			}
			
			i++;
		}
		
		for(int ele:res) {
			System.out.print(ele+" ");
		}
		
	}

}

