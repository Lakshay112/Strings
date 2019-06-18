package com.edu.strings;

import java.util.Arrays;

public class Anagram {
	public static String anam(String str,String str1){
		
		
		int len=str.length();
		int len1=str1.length();
		char[] ch=str.toCharArray();
		char[] ch1=str1.toCharArray();
		
		if(len!=len1){
			
			return null;
		}else{
			Arrays.sort(ch);
			Arrays.sort(ch1);
		}
			if(str.equals(str1)){
			
		     }
			
		return str1;
		
		
	}
public static void main(String[] args) {
	String str="listen";
	String str1="silent";
	System.out.print(anam(str,str1));
	System.out.print(" "+ str + " "+"the both are anagrams");
}
}
