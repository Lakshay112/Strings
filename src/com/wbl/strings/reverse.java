package com.wbl.strings;

public class reverse {
	
	/*public String rev(String s){
		String rev = "";
		for(int i = s.length() -1; i>= 0; i--){
			rev=rev + s.charAt(i);
		}
		System.out.println(rev);
		return s;
	}
	
	public String sub(String s){
		String s1=s.substring(0,3);
		String s2=s.substring(6);
		System.out.println(s1);
		System.out.println(s2);
		return s;
	}*/
	
	public String indexSearch(String s){
		
		int index=s.indexOf('b');//it will give the character index
		int index1=s.indexOf('n',1);///it will give the character index after 1
		int index2=s.indexOf("nan");
		System.out.println(index1);
		System.out.println(index);
		return s;
		
		//return s;
	}
public static void main(String[] args) {
	//String r=new reverse().rev("Hello");
	reverse r=new reverse();
/*	r.rev("Hello");
	r.sub("banana");*/
	r.indexSearch("banana");
}
}
