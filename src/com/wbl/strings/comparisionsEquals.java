package com.wbl.strings;

public class comparisionsEquals {
	public String equal(){
		
		String name="Ram";
		String name1="ram";
		int s3=name.compareTo(name1);
		System.out.println(s3);
		/*if(s==s1){
			System.out.print("string equals"+s);
			
			}*/
		return name1;
		

		}
	public String wrapper(){
		String str="1234";
		int num=12345;
		String s2=Integer.toString(num);
		System.out.println(num);
		int s1=Integer.parseInt(str);
		System.out.println(str);
		return str;
	}
public static void main(String[] args) {
	comparisionsEquals ce=new comparisionsEquals();
	//ce.equal("hello", "hello");
	ce.wrapper();
	
}
}
