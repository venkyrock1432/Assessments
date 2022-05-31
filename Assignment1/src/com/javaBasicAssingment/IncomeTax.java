package com.javaBasicAssingment;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IncomeTax {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the CTC of the User ");
		double Income = Double.parseDouble(br.readLine());
		double Tax = 0;
		if(Income<=180000) {
			Tax=0;
		}
		else if(Income<=300000) {
			Tax = 0.1*Income;
		}
		else if (Income<= 500000) {
			Tax = 0.2*Income;
		}
		else {
			Tax = 0.3*Income;
		}
		System.out.println("Income: "+Income+"\nTAX: "+Tax);
	}

}
