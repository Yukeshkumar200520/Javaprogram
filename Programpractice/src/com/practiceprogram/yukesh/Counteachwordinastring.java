package com.practiceprogram.yukesh;

import java.util.HashMap;
import java.util.Map;

public class Counteachwordinastring {

	public static void getcharcount(String name) {
		
		Map<Character,Integer> charmap=new HashMap<>();
		char strarray[]=name.toCharArray();
		for(char ch:strarray) {
			if(charmap.containsKey(ch)) {
				charmap.put(ch, charmap.get(ch)+1);
				
			}
			else {
				charmap.put(ch,1);
			}
		}
		System.out.println(name+":"+charmap);
	
	
	}
	
	
	public static void main(String[] args) {
		getcharcount("poda potato");

	}

}
