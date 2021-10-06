package com.general;

public class Ques03_LargestContinuousSum {
	//https://leetcode.com/problems/maximum-subarray/
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, -6, 7, 7, 7, -3, 12, 12 };
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

}
