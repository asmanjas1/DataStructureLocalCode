package com.general;

import java.util.Arrays;

public class Ques12_ReverseWordsInAString {
	
	// reverse one by one word on if condition of space " " then we can reverse the whole string;
	//we can use stack or for loop to reverse the word
	
	public static void main(String[] args) {
		String str = "i love programming very much";
		usingSplitAndExtraSpace(str);
		usingSplitAndWithoutExtraSpace(str);
	}
	
	static void usingSplitAndExtraSpace(String str){
		String[] array = str.split(" ");
		int length = array.length - 1;
		
		StringBuilder str1 = new StringBuilder();
		for(int i=length ; i>=0; i--) {
			str1.append(array[i]);
			if(i!=0)
				str1.append(" ");
		}
		
		System.out.println(str1);
	}
	
	static void usingSplitAndWithoutExtraSpace(String str) {
		String[] array = str.split(" ");
		int length = array.length;
		int l=0, r= length-1;
		while(l<=r) {
			String temp = array[l];
			array[l] = array[r];
			array[r] = temp;
			l++;
			r--;
		}
		System.out.println(Arrays.toString(array));
	}
	
	//we can reverse word by using for lop to iterate from last of the string and adding char one by one
	//we can also use swaps to reverse the word
	
	//swap method to reverse the word
	static void swapWordWithoutExtraSpace(String word) {
		int l = 0, r= word.length()-1;
		
		char[] array = word.toCharArray();
		char temp;
		while(l <= r) {
			temp = array[l];
			array[l] = array[r];
			array[r] = temp;
			l++;
			r--;
		}
		
		System.out.println(Arrays.toString(array));
	}
	
}
