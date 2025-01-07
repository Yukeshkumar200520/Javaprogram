package com.practiceprogram.yukesh;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
	int num=159;
	int count=0;
	 if (num>1) {
for (int i=1;i<=num;i++) {
	if(num%i==0) 
		count++;
}
	
	if(count==2) {
		System.out.println("its a prime number");
	}
	else {
		System.out.println("it is not prime number");
	}

	}
	 else {
		 System.out.println("Number is less than or equal to 1");
	 }
}}
