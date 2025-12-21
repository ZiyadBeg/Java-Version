package com.java.eleven.version.filesMethod;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NewFileMethod {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//File ko read karney ka logic kch aysa tha 
		Path path = Paths.get("Z:\\Study\\Java Version\\ReadFile.txt");

		byte[] bytes = Files.readAllBytes(path);
		String content = new String(bytes, StandardCharsets.UTF_8);
		System.out.println(content);
		
		//In Java 11
		Path path11 = Paths.get("Z:\\Study\\Java Version\\ReadFile.txt");
		String content11 = Files.readString(path);
		System.out.println(content11);
		
			//OR
		
		String data = Files.readString(Paths.get("Z:\\Study\\Java Version\\ReadFile.txt"));
		System.out.println(data);

	}

}
