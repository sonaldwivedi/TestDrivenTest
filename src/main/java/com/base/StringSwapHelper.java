package com.base;

public class StringSwapHelper {

	public String swaplasttwochars(String string) {
		int length = string.length();
		
		if(length<2) {
			return string;
		}
		String strExceptLast2Chars = string.substring(0, length - 2);
		char secondLastChar = string.charAt(length - 2);
		char lastChar = string.charAt(length - 1);
		return strExceptLast2Chars + lastChar + secondLastChar;
	}
}
