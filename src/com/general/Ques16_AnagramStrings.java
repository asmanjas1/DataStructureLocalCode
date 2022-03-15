package com.general;

import java.util.HashMap;
import java.util.Map;

public class Ques16_AnagramStrings {
	/**
	 * Two strings are anagram with each other when they have same characters.
	 * save one string chars in an hashmap than iterate over 2nd string if any point map don't have that key then false otherwise true
	 * we can solve it by XOR ^ bitwise operator if XOR gives 0 then true otherwise false
	 */
	
	public static void main(String[] args) {
		String s1= "hello";
		String s2 = "llhoe";
		
		solveUsingMap(s1, s2);
		solveUsingXOR(s1, s2);
	}
	
	public boolean isAnagram(String s, String t) {
        s=s.trim();
        t=t.trim();
        if(s.length() != t.length()){
            return false;
        }
        
        int len = s.length();
        int[] count = new int[256];
        for(int i=0; i< len; i++){
            count[s.charAt(i)]++;
            count[t.charAt(i)]--;
        }
        
        for(int i=0; i< 256; i++){
           if(count[i] != 0)
               return false;
        }
        
        return true;
    }
	
	final static Character PRESENT = 'P';
	 static void solveUsingMap(String s1, String s2) {
		 s1= s1.trim();
		 s2=s2.trim();
		Map<Character, Character> map = new HashMap<>();
		
		int len1 = s1.length();
		int len2 = s2.length();
		
		if(len1 != len2) {
			System.out.println("false");
			return;
		}
			
		for(int i=0; i < len1; i++) {
			map.put(s1.charAt(i), PRESENT);
		}
		
		for(int i=0; i < len2; i++) {
			if(map.get(s2.charAt(i)) == null) {
				System.out.println("false");
				return;
			}
		}
		System.out.println("true");
	}
	 
	 static void solveUsingXOR(String s1, String s2) {
		 s1=s1.trim();
		 s2=s2.trim();
		 if(s1.length() != s2.length()) {
			 System.out.println("false");
			 return;
		 }
		 StringBuilder sb = new StringBuilder(s1+s2);
		 int xor = 0;
		 for(int i =0; i< sb.length(); i++) {
			 xor = xor ^ sb.charAt(i);
		 }
		 
		 System.out.println(xor);
	 }

}
