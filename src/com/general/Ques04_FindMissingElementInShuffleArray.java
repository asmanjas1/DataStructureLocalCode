package com.general;

public class Ques04_FindMissingElementInShuffleArray {
//	https://www.geeksforgeeks.org/find-lost-element-from-a-duplicated-array/
//		http://www.ardendertat.com/2011/09/27/programming-interview-questions-4-find-missing-element/
//
//		--> we can do this hashMap ...we can put element of 2nd array in the map and then iterate over 1st array and 
//		check which element is missing in the hashmap.   o(n)
//
//		--> we can also do this with the XOR operator approach, the soln is given in the link.   o(n)
//
//		--> we can use binary search approach to solve this, when arrays are sorted only is the condition. o(nlogn).
//		soln for binary aproach::-

	public static void main(String[] args) {
		int arr1[] = {1, 4, 5, 7, 9};
        int arr2[] = {4, 5, 7, 9};
        System.out.println(findMissingelement(arr1, arr2));
	}
	
	
	static int findMissingelement(int[] a1, int[] a2) {
		int lengthA1 = a1.length;
		if (lengthA1 == 1)
			return a1[0];
	
		// special case, for first
		// element missing
		if (a1[0] != a2[0])
			return a1[0];
		int left = 0, right = lengthA1 - 1;
		while (left < right) {
			int mid = (left + right) / 2;
	
			if (a1[mid] == a2[mid]) {
				left = mid;
			} else {
				right = mid;
			}
	
			if (left == right - 1) {
				break;
			}
		}
	
		return a1[right];
	}

}
