package com.ak.util;

public class StringReverse {
	
	public static String stringReverse(String inputString) {
	   StringBuffer sb=new StringBuffer(inputString);
	   return sb.reverse().toString();
	}

}
