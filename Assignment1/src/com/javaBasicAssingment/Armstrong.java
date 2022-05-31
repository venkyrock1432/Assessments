package com.javaBasicAssingment;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Finding ArmstrongNumber Or Not */
public class Armstrong {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*Number is Given By User BY USing BufferedReader*/
		int Number = Integer.parseInt(br.readLine());
		int Temp = Number;
		int A =0;
		
		/*Logic For Finding Armstrong Number or Not*/
		while(Number>0) {
			 int rem = Number % 10;
	            A = (A) + (rem * rem * rem);
	            Number = Number / 10;	
		}
		if (Temp == A) {
			System.out.println(Temp+" Is a Armstrong Number");
		}
		else {
			System.out.println(Temp + " Is not a ArmStrong Number");
		}
		
		
		
	}
}

