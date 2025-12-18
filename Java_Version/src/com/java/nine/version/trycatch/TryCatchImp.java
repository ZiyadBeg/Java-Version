package com.java.nine.version.trycatch;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatchImp {
public static void main(String[] args) throws FileNotFoundException {
	
	try(BufferedReader reader = new BufferedReader(new FileReader("abc.txt"))){
		//before java 9
	}catch (Exception e) {
	}; 
	
	
	//JAVA 9
	BufferedReader reader = new BufferedReader(new FileReader("abc.txt"));
	try(reader){
		//After java 9 reader bhar likha hai
	}catch (Exception e) {
	}; 
}
}
