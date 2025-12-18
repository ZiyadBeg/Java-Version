package com.java.nine.version.immutablecollection;

import java.util.List;

public class ImmutableCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strKeyList = List.of("key1", "key2", "key3");
		strKeyList.add("key4");//agar add kia to below exception aayega
		//Exception in thread "main" java.lang.UnsupportedOperationException
		//at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142)
		System.out.println(strKeyList);
	}

}
