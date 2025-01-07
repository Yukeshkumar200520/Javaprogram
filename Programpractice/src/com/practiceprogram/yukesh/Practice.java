package com.practiceprogram.yukesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Practice {

	public static void main(String[] args) {
// String reversal program---------------------------------------
// String s ="yukesh";
// String res="";
//  for (int i =s.length()-1;i>=0;i--) {
//	  res+=s.charAt(i);
//  }
//System.out.println(res);-------------------------------------------
		
int [] arr= {1,2,3,9,5,6};// array iteration
for (int i=0;i<arr.length;i++) {
	System.out.println(arr[i]);
	
	
}

ArrayList<String> a= new ArrayList<String>();
a.add("yukesh");
a.add("keerthana");

a.addFirst("B");
for(String s:a) {
	System.out.println(s);
}
System.out.println(a.contains("B"));
	}

}
