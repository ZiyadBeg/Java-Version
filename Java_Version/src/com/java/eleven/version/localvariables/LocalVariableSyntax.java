package com.java.eleven.version.localvariables;

import java.util.List;
import java.util.function.BinaryOperator;

public class LocalVariableSyntax {
	
		
public static void main(String[] args) {
	//Java 8
			List<String> names = List.of("Java", "",null, "Spring", "", "11");	
			names.stream()
		     .filter(s -> !s.isEmpty())
		     .forEach(System.out::println);
	List<String> list = List.of("Java", "",null, "Spring", "", "11");	
	
	list.stream()
    .filter((var s) -> !s.isEmpty())
    .forEach(System.out::println);	//Yahan var s lambda parameter hai--> var Java 11 se allowed hua
//Iska sabse bada fayda Annotations use kar sakte ho below example	
	
	//list.stream()    .map((@NonNull var s) -> s.toUpperCase())    .forEach(System.out::println);

	BinaryOperator<String> join =
	        (var s1, var s2) -> s1 + " " + s2;
	System.out.println(join.apply("Hello", "Java"));

}
}
