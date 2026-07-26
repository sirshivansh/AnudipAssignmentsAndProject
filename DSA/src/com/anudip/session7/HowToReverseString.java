package com.anudip.session7;

public class HowToReverseString {

	public static void main(String[] args) {
		String str = "Madam";
		int len = str.length();
		
		StringBuilder s = new StringBuilder("");
		for(int i = len-1 ; i>=0; i--) {
			char ch = str.charAt(i);
			s.append(ch);
		}
		System.out.println(s);
		
		String rev = s.toString();
		
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}

}
