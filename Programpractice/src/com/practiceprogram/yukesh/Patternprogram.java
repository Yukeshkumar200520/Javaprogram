package com.practiceprogram.yukesh;

import java.util.Scanner;

public class Patternprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Scanner scanner=new Scanner(System.in);
//int row,column=0;
//System.out.println("Enter the number of lines" );
//int numberoflines= scanner.nextInt();
//
//for (row=0;row<numberoflines;row++) {
//	for(column=0;column<=row;column++) {
//		System.out.print("* ");
//	}
//System.out.println();}
int startingnumber=1;
int row,column=0;
int limit;
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the numbers");
limit=scanner.nextInt();
	for (row=0;row<limit;row++) {
		for (column=0;column<=row;column++) {
			System.out.print(startingnumber+" ");
			startingnumber+=1;
		}
	System.out.println();
	
	}
	
	}

}
