package com.practiceprogram.yukesh;

public class Intreverse {

	public static void main(String[] args) {
		int num=500000000;
		int n=num;
		int rem=0;
		int res=0;
        while (num > 0) {
            rem = num % 10;// to find the last value which is reminder
            res = (res * 10) + rem;// to store the reminder value to reverse
            num = num / 10;// to remove the last value
}

System.out.println(res);
if(res==n) {
	System.out.println("Palindrome");
}
else {
	System.out.println("bye");
}
	}

}
