package com.java.eleven.version.newArrayMethod;

import java.util.List;

public class NewCollectionConversionArrayMethod {
public static void main(String[] args) {
	//Java 8
	List<String> list = List.of("A", "B", "C");
	
	String[] arr = list.toArray(new String[list.size()]);
		//OR
	String[] arrEmpty = list.toArray(new String[0]); //for Empty array 
	
	//In Java 11
	String[] arrJava11 = list.toArray(String[]::new);////No size mention,Clean & readable
	
	
}
}
