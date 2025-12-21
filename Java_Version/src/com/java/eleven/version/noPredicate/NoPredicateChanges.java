package com.java.eleven.version.noPredicate;

import java.util.List;
import java.util.function.Predicate;

public class NoPredicateChanges {
public static void main(String[] args) {
	List<String> names = List.of("Java", "", "Spring", "", "11");
	names.stream()
	     .filter(s -> !s.isEmpty())
	     .forEach(System.out::println);
	
	names.stream()
    .filter(Predicate.not(String::isEmpty))//Readable,Method reference friendly
    .forEach(System.out::println);

}
}
