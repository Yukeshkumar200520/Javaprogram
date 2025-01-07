package com.practiceprogram.yukesh;

public class Removeduplicatesinastring {

public static void main(String[] args) {
	String s= "APPLE is my fav fruit";
	String res=" ";
	for (int i=0;i<s.length();i++) {
		String ch=""+s.charAt(i);
		
		if (res.contains(ch)) {
			continue;
			}
		res+=ch;		
	}
System.out.println(res);
}}
	
