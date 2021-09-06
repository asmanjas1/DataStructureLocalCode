package com.string;

public class StringCombinations {
	
	public static void main(String[] args) {
		String str = "ABC";
		printAllPermutes(str, 0, str.length()-1);
	}
	
	static void printAllPermutes(String str, int l, int r) {
		if(l==r) {
			System.out.println(str);
		} else {
			for(int i=l; i<=r;i++) {
				str = swap(str, l,i);
				printAllPermutes(str, l+1, r);
				str = swap(str, l, i);
			}
		}
	}
	
	static String swap(String str, int i, int j) {
		char[] tempA = str.toCharArray();
		char temp = tempA[i];
		tempA[i] = tempA[j];
		tempA[j] = temp;
		
		return String.valueOf(tempA);
	}

}
