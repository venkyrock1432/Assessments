package com.StringBuilder;

public class StringBuilderMethods {

	public static void main(String[] args) {
		StringBuilder S = new StringBuilder();
		StringBuilder A=new StringBuilder("HOW");
		System.out.println(S.append("Hello,How Are You??"));
		System.out.println(S.capacity());
		System.out.println(S.charAt(6));
		System.out.println(S.codePointAt(10));
		System.out.println(S.codePointBefore(11));
		System.out.println(S.codePointCount(2, 10));
		System.out.println(S.compareTo(A));

	}

}
