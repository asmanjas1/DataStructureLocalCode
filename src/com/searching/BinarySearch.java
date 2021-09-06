package com.searching;

public class BinarySearch {

	public static void main(String[] args) {
		
		 int arr1[] = { 1, 4, 5, 7, 9 };
	        int arr2[] = { 4, 5, 7, 9 };
	        System.out.println(findMissingelement(arr1, arr2));
		int[] arr = { 2, 3, 4, 10, 40 };
		System.out.println(binarySearch(arr, 3));
		int[] a = { 1, -10, 2, 3, 4, -6, 7, 7, 7, -3, 12, 12 };
		System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
	}

	static int maxSubArraySum(int a[]) {
		int size = a.length;
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

		for (int i = 0; i < size; i++) {
			max_ending_here = max_ending_here + a[i];
			if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;
			if (max_ending_here < 0)
				max_ending_here = 0;
		}

		setSs(a);
		return max_so_far;
	}

	static void setSs(int[] nums) {
		int sum = Integer.MIN_VALUE;
		int currentSum = 0;
		int size = nums.length;
		for (int i = 0; i < size; i++) {
			currentSum = currentSum + nums[i];

			if (currentSum > sum)
				sum = currentSum;

			if (currentSum < 0)
				currentSum = 0;
		}
		System.out.println(sum);
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

	public static int binarySearch(int[] a, int x) {
		int left = 0, right = a.length - 1;
		while (left <= right) {
			int mid = (right + left) / 2;
			if (a[mid] == x) {
				return mid;
			}

			if (a[mid] < x) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}

		}

		return -1;
	}

}
