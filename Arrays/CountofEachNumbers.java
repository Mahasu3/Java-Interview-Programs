package Arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountofEachNumbers {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		
		//countnumbers(arr);
		
		countnumbersway2(arr);
		
	}

	private static void countnumbersway2(int[] arr) {
		
		int len=arr.length;
		boolean[] visited=new boolean[len];
		
		for(int i=0;i<len;i++) {
			if(!visited[i]) {
				int count=1;
				for(int j=i+1;j<len;j++) {
					if(arr[i]==arr[j]) {
						visited[j]=true;
						count++;
					}
				}
				System.out.print(arr[i] + " " + count);
	            System.out.println();
			}
		}
		
	}

	private static void countnumbers(int[] arr) {
		
		
		    Set<Integer> visited = new HashSet<>();
		    
		    for (int i = 0; i < arr.length; i++) {
		        if (!visited.contains(arr[i])) {
		            int count = 1;
		            for (int j = i + 1; j < arr.length; j++) {
		                if (arr[i] == arr[j]) {
		                    count++;
		                }
		            }
		            
		            System.out.print(arr[i] + " " + count);
		            System.out.println();
		            
		            visited.add(arr[i]);
		        }
		    }
		}

		
		
		
         }
         
         
	


