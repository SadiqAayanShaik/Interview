package com.test;

public class CountSpecialCharacters {
	public static void main(String[] args) {

		String s = "sadiq@#123";
		int count = 0;
		int count1=0;
		String special="";
		String removeSpecial ="";

		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i)) && 
					!Character.isWhitespace(s.charAt(i)) && 
					!Character.isLetter(s.charAt(i))) {
               
				count++;
                special=special+s.charAt(i);
			}
			else if(!Character.isDigit(s.charAt(i)))
			{
				removeSpecial=removeSpecial+s.charAt(i);
			}
		}
		 
		System.out.println("SpecialCharacters: "+special+" Count: " +count);
		System.out.println("After removing special character and digits: "+removeSpecial);
	}

}
