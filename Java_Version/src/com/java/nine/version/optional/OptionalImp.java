package com.java.nine.version.optional;

import java.util.Optional;

public class OptionalImp {
public static void main(String[] args) {
	Optional<String> optionalName = Optional.of("Ziyad");
	optionalName.ifPresent(value -> System.out.println(value));
	//Java 8 if present hai toh hum else khud se likhana hota tha but now in Java 9
	
	//Agar Optional empty ho, to dusra Optional return kar sakte ho.
	optionalName.ifPresentOrElse(
		    value -> System.out.println(value),
		    () -> System.out.println("Value nahi hai to logic")
		);
	
	
	//Agar Optional empty ho, to dusra Optional return kar sakte ho.
	Optional<String> opt1 = Optional.empty();
	Optional<String> opt2 = Optional.of("Default");
	Optional<String> result = opt1.or(() -> opt2);
	System.out.println(result.get());
	
	//Optional ko Stream mein convert kar sakte ho.
		Optional<String> opt = Optional.of("Java");
		opt.stream().forEach(System.out::println);
	
	//Java 8 se hi tha, but Java 9 ke baad aur recommended ho gaya null pointer k liye
	Optional<String> optOf=Optional.of(null); //null pointer
	Optional<String> optOf1 = Optional.ofNullable(null); //safe hai
}
}
