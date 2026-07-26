package com.anudip.session7;

public class StringBufferVsStringBuilder {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("India");
		sb1.append(" is country");
		System.out.println("StringBuffer: " + sb1);
		
		StringBuilder sb2 = new StringBuilder("India");
		sb2.append(" is country");
		System.out.println("StringBuilder: " + sb2);
	}
}
