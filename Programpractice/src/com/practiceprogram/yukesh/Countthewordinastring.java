package com.practiceprogram.yukesh;

import java.util.Scanner;

public class Countthewordinastring {

	public static void main(String[] args) {
		int count= 1;
		System.out.println("Enter the string ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<s.length()-1;i++) {
		if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')){
			count++;
		}
			
		}
System.out.println("The total words in a string " +count);
	}

	
}
