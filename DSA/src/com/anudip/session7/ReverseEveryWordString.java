package com.anudip.session7;

public class ReverseEveryWordString {

	public static void main(String[] args) {
		String str = "India is my country";
		String[] words = str.split(" ");

		int index = 0;
		for (String word : words) {
			StringBuilder s = new StringBuilder("");
			for (int i = word.length() - 1; i >= 0; i--) {
				char ch = word.charAt(i);
				s.append(ch);
			}
			words[index] = s.toString();
			index++;
		}
		for (String st : words) {
			System.out.print(st + " ");
		}
	}

}
