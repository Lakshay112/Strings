package com.wbl.strings;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.edu.strings.Anagram;

@Test
public class TestAnagram {
	Anagram an=new Anagram();
	String str="silent";
	String str1="listen";
	String actual=an.anam(str, str1);


}
