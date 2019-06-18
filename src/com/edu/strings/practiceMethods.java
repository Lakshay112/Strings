package com.edu.strings;

public class practiceMethods {
	
	public String immutable(){
		String s=new String("Lakshay");
		s.concat("L");				//if you give reference variable for this it will be add like Lakshayl
		System.out.println(s);
		return s;
		
	}
	
	public String mutable(){
		StringBuffer sb=new StringBuffer("Hai");
		sb.append("Hello");
		System.out.println(sb);
		return null;
	}
	public String equal(){
		String s1=new String("Hai");
		String s2=new String("Hai");
		System.out.println(s1==s2);		//equal operators will compare two references and address
		System.out.println(s1.equals(s2));//.equals method also compare to references and address but in String .equalmethod ovverride the Object class
		return s2;		///Object class equal method ment for reference comparision or address comparison
	}
	public String equal1(){
		StringBuffer sb1=new StringBuffer("Ram");
		StringBuffer sb2=new StringBuffer("Ram");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		return null;
		
	}
public static void main(String[] args) {
	practiceMethods pM=new practiceMethods();
	pM.immutable();
	pM.mutable();
	pM.equal();
	pM.equal1();
	
	
	
}

}
