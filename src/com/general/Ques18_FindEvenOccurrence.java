package com.general;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ques18_FindEvenOccurrence {
	public static void main(String[] args) {
		int arr[] = { 9, 12, 23, 10, 12, 12, 15, 23, 14, 12, 15 };
		//solveBy2Sets(arr);
		//solveByHashMap(arr);
		solveByXOROperator(arr);
	}
	
	static void solveByXOROperator(int[] arr) {
		long xor = 0L;
		for (int i = 0; i < arr.length; i++) {
			int curr = 1 << arr[i];
			xor ^= curr;
		}
		
		for (int i = 0; i < arr.length; i++) {
			int curr = 1 << arr[i];
			if(((curr & xor) == 0)){
				System.out.println(arr[i]);
			}
		}
	}
	
	static void solveByHashMap(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			Integer curr = arr[i];
			
			if(map.get(curr) != null) {
				map.put(curr, map.get(curr)+1);
			}else {
				map.put(curr, 1);
			}
		}
		
		map.entrySet().forEach(entry -> {
			if(entry.getValue() % 2 ==0) {
				System.out.println(entry.getKey());
			}
		});
	}

	static void solveBy2Sets(int[] arr) {
		Set<Integer> evenSet = new HashSet<>();
		Set<Integer> oddSet = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			if (oddSet.add(arr[i])) {
				evenSet.remove(arr[i]);
			} else {
				oddSet.remove(arr[i]);
				evenSet.add(arr[i]);
			}
		}
		System.out.println(evenSet);
	}

}
