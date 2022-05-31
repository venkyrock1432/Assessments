package com.exceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DividedByTwoNumbers {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter First Number");
		int FirstNumber = Integer.parseInt(br.readLine());
		System.out.println("Enter Second Number");
		int SecondNumber = Integer.parseInt(br.readLine());
		int result;
		try {
			result = FirstNumber/SecondNumber;
			System.out.println("The Result is: "+result);
		}
		catch(ArithmeticException e) {
			System.out.println("given second Number is more than Zero");
			
		}

	}

}
