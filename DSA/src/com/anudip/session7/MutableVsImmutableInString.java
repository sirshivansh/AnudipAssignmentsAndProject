package com.anudip.session7;

public class MutableVsImmutableInString {

	public static void main(String[] args) {
		String s1 = "India";
		System.out.println(s1);
		s1.concat(" is Country");
		System.out.println(s1);
		
		System.out.println("```````````````");
		
		StringBuffer sb = new StringBuffer("India");
		System.out.println(sb);
		sb.append(" is Country");
		System.out.println(sb);
		
		System.out.println("```````````````");
		
		StringBuilder sb2 = new StringBuilder("India");
		System.out.println(sb2);
		sb2.append(" is Country");
		System.out.println(sb2);
	}
}
