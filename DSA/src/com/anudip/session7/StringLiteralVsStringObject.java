package com.anudip.session7;

public class StringLiteralVsStringObject {
	
	public static void main(String[] args) {
		String s1 = "India";
		String s2 = "India";
		
		if(s1 == s2)
			System.out.println("Both are equal");
		else
			System.out.println("Not Equal");
		
		if(s1.equals(s2))
			System.out.println("Both are equal");
		else
			System.out.println("Not Equal");
		
		
		String s3 = new String("India");
		String s4 = new String("India");
		
		if(s3 == s4)
			System.out.println("Both are equal");
		else
			System.out.println("Not Equal");
		
		if(s3.equals(s4))
			System.out.println("Both are equal");
		else
			System.out.println("Not Equal");
	}
}
