package com.array;

import java.util.Arrays;

public class ShuffleArray {
	public static void main(String[] args) {
		int[] a= {1,3,5,7,2,4,6,8};
		shuffleArray(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
	}
	
	static void shuffleArray(int[] a, int l, int r) {
		if(l>r)
			return;
		if(r-l == 1)
			return;
		
		int mid = (l+r)/2;
		int mmid = (l+mid)/2;
		int temp = mid+1;
		
		for(int i=mmid+1; i<= mid; i++) {
			int temp1= a[i];
			a[i]=a[temp];
			a[temp] = temp1;
			temp++;
		}
		
		shuffleArray(a, l, mid);
		shuffleArray(a, mid+1, r);
	}

}
