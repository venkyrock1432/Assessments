package com.javaBasicAssingment;

import java.util.Scanner;

public class StudentResults {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Subject1 marks: ");
		int sub1=sc.nextInt();
		System.out.println("Enter Subject2 marks: ");
		int sub2=sc.nextInt();
		System.out.println("Enter Subject3 marks: ");
		int sub3=sc.nextInt();
		
		if(sub1>60 && sub2>60 && sub3>60) {
			System.out.println("Passed");
		}
		else if(sub1<60 && sub2>60 && sub3>60 || sub1>60 && sub2<60 && sub3>60 || sub1>60 && sub2>60 && sub3<60) {
			System.out.println("Promoted");
		}
		else {
			System.out.println("Fail");
		}
		
		
	}


}
