package com.practiceprogram.yukesh;

public class Lastwordinastring {

	public static void main(String[] args) {
		String s ="Yukesh keerthy always together forever ?";
		String s1=s.replace('?', ' ');
		s1.trim();
		System.out.println(s1);
		String lw=s1.substring(s1.lastIndexOf(' ')+1);
		//System.out.println(lw);
		//System.out.println(s);
		//String lw=y.substring(y.lastIndexOf(" ")+1);
		System.out.println(lw);

		String []splitted=s1.split(" ");
		String fin=(splitted[splitted.length-1]);
		System.out.println(fin);
		
		
	}

}
