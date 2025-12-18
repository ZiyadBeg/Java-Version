package com.java.nine.version.streamImprove;

import java.util.List;

public class StreamClassImprovement {
public static void main(String[] args) {
	List<Integer> nums = List.of(1, 2, 3, 4, 5, 1);

	/*nums.stream()
	    .takeWhile(n -> n < 4)
	    .forEach(System.out::println);*/
	//1 2 3 --> 4 aate hi stream stop ho jaati hai
	
	nums.stream()
    .dropWhile(n -> n < 4)
    .forEach(System.out::println);
//4 5 1	 jaise he condition false milti hai toh woh yahin ruk jata hai iskaliye 1 bi print kia hai
	
}
}
