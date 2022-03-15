package com.array;

public class P1 {
	
	public static void main(String[] args) {
		long[] arr = {3};
		long k = 567;
		long N = 1;
		
		int output = -1; 
		for(int i = 0; i< N; i++) {
			long sum = 0;
			for(int j = 0; j<= i; j++) {
				sum = (long) (sum + Math.pow(arr[j], i));
			}
			
			if( sum >= k) {
				output = i;
				break;
			}
		}
		
		System.out.println(output);
	}

}
