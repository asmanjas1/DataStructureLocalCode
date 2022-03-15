package com.general;

import java.util.HashMap;
import java.util.Map;

public class Ques15_FirstNonRepeated_CharInAString {
	// https://www.geeksforgeeks.org/given-a-string-find-its-first-non-repeating-character/
	// Max no of distinct chars we have in ASCII system are 256
	// Unicode has 143,859 no of distinct characters
	// we can count each chars frequency and then go over the string in a for loop
	// and encounter 1 for first ....return it

	/**
	 * given an array of chars we will count frequency of each character For
	 * counting we can save counts in an hashmap as value and char as key
	 * solveUsingMap For counting we can also create an array with length as max
	 * distinct chars available in the ASCII/UNICODE: solveUsingArray
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		char[] arr = { 'a', 'b', 'f', 'e', 'a', 'h', 'h', 'f', 'q', 'i', 'b','o', 'g', 'q' };
		solveUsingMap(arr);
		solveUsingArray(arr);
	}

	static void solveUsingMap(char[] arr) {
		int length = arr.length;

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < length; i++) {
			int count = map.get(arr[i]) == null ? 1 : map.get(arr[i]) + 1;

			map.put(arr[i], count);
		}

		for (int i = 0; i < length; i++) {
			if (map.get(arr[i]) == 1) {
				System.out.println(arr[i]);
				break;
			}
		}
	}
	
	static void solveUsingArray(char[] arr) {
		int length = arr.length;
		
		int[] countArray = new int[256];

		for (int i = 0; i < length; i++) {
			countArray[arr[i]]++;
		}

		for (int i = 0; i < length; i++) {
			if (countArray[arr[i]] == 1) {
				System.out.println(arr[i]);
				break;
			}
		}
	}
}
