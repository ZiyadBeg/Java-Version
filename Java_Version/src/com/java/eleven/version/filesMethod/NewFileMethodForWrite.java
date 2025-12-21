package com.java.eleven.version.filesMethod;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NewFileMethodForWrite {
public static void main(String[] args) throws IOException {
	//In Java 8
	Path path = Paths.get("Z:\\Study\\Java Version\\out.txt");
	Files.write(
	    path,
	    "Hello Java".getBytes(StandardCharsets.UTF_8)
	);
	
	 
	 //In Java 11
	 Files.writeString(path, "Hello Java 11");
	 		//OR
	 Path path11 = Paths.get("out.txt");
	 Files.writeString(path11, "Hello Java 11");
	 System.out.println("Done Writing");
}
}
