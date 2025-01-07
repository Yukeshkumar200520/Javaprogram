package com.practiceprogram.yukesh;

public class Countoccurence {

	public static void main(String[] args) {
		String s="Yukesh keerthy";
		int totaloccbef= s.length();
		
		int totalafterrem=s.replace("e", "").length();
		int count=totaloccbef-totalafterrem;
		System.out.println("Number of occurence of e "+count);

	}

}
