package com.general;

public class Ques19_FindNextSmallestPalindrome {
	public static void main(String[] args) {
		isPalindrome(11311);
		isPalindromeByReverse(13321);
		
		findSmallestValidPalindrome(45312);
	}
	
	static void findSmallestValidPalindrome(int n) {
		StringBuilder s = new StringBuilder();
		s.append(n);
		
		
		if(s.length() % 2 == 0) {
			findPalindromeForEven(s);
		} else {
			findPalindromeForOdd(s);
		}
	}
	
	static String findReverse(StringBuilder s) {
		int len = s.length();
		String str = null;
		if(len %2 ==0 ) {
			str = s.substring(0, len/2);
			str = str + s.reverse().substring(len/2, len);
		} else {
			str = s.substring(0, len/2+1);
			str = str + s.reverse().substring(len/2+1, len);
		}
		return str;
	}
	
	static void findPalindromeForEven(StringBuilder s) {
		String revStr = findReverse(s);
		System.out.println(revStr);
		if(Integer.valueOf(s.toString()) < (Integer.valueOf(revStr))) {
			System.out.println("Palindrome is: " +revStr);
			return;
		}
		
		if(s.charAt((s.length() /2) -1) == '9') {
			
		} else {
			
		}
	}
	
	static void findPalindromeForOdd(StringBuilder s) {
		String revStr = findReverse(s);
		System.out.println(revStr);
	}

	static void isPalindromeByReverse(int n) {
		int rev = 0;
		for (int i = n; i > 0; i /= 10) {
			rev = rev * 10 + i % 10;
		}
		
		if(rev == n) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}
	
	static void isPalindrome(Integer n) {
		String no = n.toString();
		
		int l=0, r=no.length()-1;
		
		boolean isValid = true;
		while(l<r) {
			if(no.charAt(l) != no.charAt(r)) {
				isValid = false;
				break;
			}
			l++;
			r--;
		}
		
		if(isValid)
			System.out.println("palindrome");
		else
			System.out.println("Not palindrome");
	}
}
