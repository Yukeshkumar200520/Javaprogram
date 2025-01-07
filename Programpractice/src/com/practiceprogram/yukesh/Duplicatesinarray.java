package com.practiceprogram.yukesh;

import java.util.HashSet;
import java.util.Set;

public class Duplicatesinarray {
public static void main(String[] args) {
	int [] arr= {1,2,2,3,4,5,66,66,8,9,8};
	for (int i=0;i<arr.length-1;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				System.out.println(arr[i]);
			}
		}
	}
	
}
}
// for (int i=0;i<arr.length-1;i++){
// for (int j=i+1;j<arr.length;j++){
// if(arr[i]==arr[j]){
//sysout(arr[i]);}

//}}
