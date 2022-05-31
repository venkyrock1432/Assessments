package com.String;

public class StringMethods {

	public static void main(String[] args) {
		String S = "Java String pool refers to collection of Strings which are stored in heap memory";
		System.out.println("String to console in lowercase: "+S.toLowerCase()+"\n");
		System.out.println("String to console in Uppercase: "+S.toUpperCase()+"\n");
		System.out.println("String After replace the 'a' with '5' : "+S.replace("a","$")+"\n");
		System.out.println("the original String contains the word 'collection': "+S.contains("collection")+"\n");
		System.out.println("matches the original: "+S.equals("java string pool refers to collection of strings which are stored in heap memory")+"\n");
		System.out.println("Matches the Original But Ignore the Cases :"+S.equalsIgnoreCase("java string pool refers to collection of strings which are stored in heap memory")); 
		
		

	}

}
