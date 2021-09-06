package com.string;

public class StringQue {
	
	public static void main(String[] args) {
		System.out.println(checkCombineIsValid("abc", "def", "dabecf"));
	}
	
	static boolean checkCombineIsValid(String s1, String s2, String shuffle) {
		int s1l = 0, s2l=0, ssL = shuffle.length(), s3l=0;
		
		while( s3l < ssL) {
			if(s1l < s1.length() && shuffle.charAt(s3l) == s1.charAt(s1l)) {
				s1l++;
			} else if( s2l < s2.length() && shuffle.charAt(s3l) == s2.charAt(s2l)) {
				s2l++;
			} else {
				return false;
			}
			
			s3l++;
		}
		
		return true;
	}

}
