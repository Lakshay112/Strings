package com.edu.strings;

public class searchChar {
	public static void main(String[] args) {
		/*String s="hello hai";
		int index=s.indexOf("hello");
		System.out.println(index);
		if(index == -1){
			System.out.print("hello");
			
		}else{
			System.out.println("found index value"+index);
		}*/
		String str="this is java";
		System.out.println(removecharAt(str,3));
	}

	private static String removecharAt(String s,int pos) {
		
		return s.substring(0,pos)+s.substring(pos +1);
	}

}
