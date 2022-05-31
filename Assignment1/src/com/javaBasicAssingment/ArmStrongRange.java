package com.javaBasicAssingment;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Finding the ArmStrongNumber Between some Range */
public class ArmStrongRange {

	public static void main(String[] args) throws Exception {
		
		/* giving the Input Numbers By User */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Starting Number : ");
		int FirstNumber = Integer.parseInt(br.readLine());
		System.out.print("Enter End Number : ");
		int LastNumber = Integer.parseInt(br.readLine());
		
		/*Logic for Finding the ArmStrong Numbers Between some range given by user */
		for(int i=FirstNumber;i<=LastNumber;i++) {
			int n=i;
			int r=0;
			int res=0;
			while(n>0) {
				r=n%10;
				res+=(r*r*r);
				n=n/10;
			}
			if(i==res) {
				System.out.println(i+" is ArmStrong Number");
				
			}
		}
				
	}

}
