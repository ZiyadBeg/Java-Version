package com.java.eleven.version.newSting;

public class NewStringMethods {

	public static void main(String[] args) {
		String strBlank = " Hello, Java 11! ";
		String strBlank1 = "";
		String strBlank2 = "   ";
		String strBlank3= null;
		
		System.out.println(strBlank.isBlank());//false
		System.out.println(strBlank1.isBlank());//true
		System.out.println(strBlank2.isBlank());//true
		System.out.println(strBlank3.isBlank());//Null pointer Exception
		
		//String ko multiple lines mein tod kar stream banata hai
		String strLines = "Hello\nJava\n11 ";
		
		strLines.lines().forEach(System.out::println);
		//Hello
		//Java
		//11
		
		//strip-->String ke starting aur ending ke spaces hata deta hai
		//stripLeading-->Sirf starting ke spaces hataata hai
		//stripTrailing-->Sirf ending ke spaces hataata hai
		String strStrip = " Java  ";
		String strStripLeading=  " Java  ";
		String strStripTrailing =  " Java  ";
		System.out.println(strStrip.strip()); // "Java"
		System.out.println(strStripLeading.stripLeading());// "Java  "
		System.out.println(strStripTrailing.stripTrailing());// "  Java"
		
		
		//repeat -->String ko given times repeat karta hai
		System.out.println("Hi ".repeat(2));//Hi Hi
	}

}
