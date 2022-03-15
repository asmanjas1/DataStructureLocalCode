package com.general;

public class Ques17_SearchUnknownLengthArray {
	
	public static void main(String[] args) {
		int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
		int key = 1600;
		
		searchIt(arr, key);
	}

	private static void searchIt(int[] arr, int key) {
		int l =0, r=1;
		
		while(arr[r] < key && l < r) {
			l = r;
			if(2*r < arr.length -1) {
				r = 2*r;
			} else {
				r = arr.length - 1;
			}
		}
		
		int matchIndex = -1;
		while(l <= r) {
			int mid = (l+r)/2;
			
			if(arr[mid] == key) {
				matchIndex = mid;
				break;
			}
			
			if(arr[mid] < key) {
				l = mid+1;
			} else {
				r = mid-1;
			}
		}
		
		System.out.println(matchIndex);
		
	}

}
