package com.java.eleven.version.aarch64;

import java.math.BigInteger;

public class IntrinsicsProgram {

	public static void main(String[] args) {
		int x = Math.min(25, 90);
		BigInteger a = new BigInteger("123456789");
		BigInteger b = new BigInteger("987654321");
		BigInteger c = a.multiply(b);

		while (true) {
			byte[] arr = new byte[1024 * 1024];  // 1MB object banega, reference local scope mein lost
		}
	}

}
