package com.wbl.strings;

public class Examples {
	
	public char range(){
		System.out.println("Roman Alphabet:");
		for(char c='A';c<'Z';c++){
			System.out.println(c);
			
		}
		return 0;

	}
	public String upperCase(String str){
		String uN=str.toUpperCase();
		System.out.println(uN);
		return str;
		
	}
	
	public String index(String str){
		System.out.println(str.charAt(0));
		return str;
	}
	public String replace(){
		String str="Ram";
		str = str.replace("Ram", "Ravi");
		System.out.println(str);
		return str;
	}
	
	public String trav(String s){
		for(int i=0;i<s.length();i++){
			char letter=s.charAt(i);		//here itdisplaying thestring each line
			System.out.println(letter);
		}
		return s;
		
}
	
	public String convert(String s){
		for(char letter:s.toCharArray()){
			System.out.print(letter);
			
		}
		
		return s;
		
		
	}
	public static void main(String[] args) {	
		String s="Hello";
		System.out.println(s.charAt(0));
		Examples ex=new Examples();
		ex.range();		
		ex.upperCase("lakshay");
		ex.index("Hello");
		ex.replace();
		ex.trav("Apple");
		ex.convert("Banana");
			
		
	}

	}


