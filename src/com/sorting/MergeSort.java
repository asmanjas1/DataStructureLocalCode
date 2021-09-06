package com.sorting;

public class MergeSort {
	
	public static void main(String[] args) {
		MergeSort obj = new MergeSort();
		int[] arr = {9,7,3,6,2};
		obj.mergeSort(arr, 0, arr.length-1);
		
		for(int v: arr) {
			System.out.println(v);
		}
	}
	
	void mergeSort(int[] arr, int l, int r) {
		if(l< r) {
			int mid = (l+r)/2;
			mergeSort(arr, l, mid);
			mergeSort(arr, mid+1, r);
			merge(arr, l, mid, r);
		}
	}
	
	void merge(int[] arr, int l, int mid, int r) {
		int i=l, j=mid+1, k=0;
		int[] temp = new int[r-l+1];
		while(i<= mid && j<= r) {
			if(arr[i]<= arr[j]) {
				temp[k] = arr[i];
				k++;
				i++;
			} else {
				temp[k]= arr[j];
				k++;
				j++;
			}
		}
		
		while(i<=mid) {
			temp[k]=arr[i];
			k++;
			i++;
		}
		
		while(j <= r) {
			temp[k]= arr[j];
			k++;
			j++;
		}
		
		for(int c=l; c<= r; c++) {
			arr[c]=temp[c-l];
		}
	}
}
