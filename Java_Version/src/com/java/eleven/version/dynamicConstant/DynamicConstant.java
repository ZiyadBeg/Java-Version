package com.java.eleven.version.dynamicConstant;
class A{
	static final long TIME = System.currentTimeMillis();
}
class B{
	static final long TIME = System.currentTimeMillis();
}
//before java 10 yeh sab alag alag value deyte the 

public class DynamicConstant {
	
	static final long TIME = System.currentTimeMillis();
	//in java 11 all value has been cached at constant pool
	public static void main(String[] args) {

	}
}
