package com.practiceprogram.yukesh;

public class Splitstring {

	public static void main(String[] args) {
		String s ="YK007";
		String res="";
		
		//swap two strings without 3rd variable

		String str1 = "Yukesh";
		String str2 = "Kumar";

		System.out.println("Before Swap:");
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);

		// Swap logic without a third variable
		str1 = str1 + str2; // Concatenate both strings
		str2 = str1.substring(0, str1.length() - str2.length()); // Extract the original str1
		str1 = str1.substring(str2.length()); // Extract the original str2

		System.out.println("After Swap:");
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);

	
		
//		String[] splitted= s.split("Kumar");l̥
//		System.out.println(splitted[0]);
//		System.out.println(splitted[1].trim());
		
		//Reverse string
		
//		for (int i=s.length()-1;i>=0;i--) {
//			res+=s.charAt(i);
//		}
//		System.out.println(res);
//		if (res.equals(s))
//			
//		{
//			System.out.println(res+ " It is a palindrome");
//		}
//		else {
//			System.out.println(res+ " It is not  a palindrome");
//		}
//		

	}

}


