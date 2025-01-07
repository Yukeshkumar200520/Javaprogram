package com.practiceprogram.yukesh;

public class Sumofarray {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5};
		int sum=0;
		String s="550";
		for (int n:a)
		{
			sum+=n;
			
		}
	System.out.println("Sum " +sum);
	/*
	 * int transformed=Integer.parseInt(s); transformed+=1;
	 * System.out.println(transformed);
	 */
	String st=s.valueOf(sum);
	System.out.println(st);
	String[]as=st.split("");
	for(String fas:as) {
		System.out.println(fas);
	}
	}

}
