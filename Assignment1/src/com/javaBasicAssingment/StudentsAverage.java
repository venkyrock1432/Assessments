package com.javaBasicAssingment;

import java.util.Scanner;

public class StudentsAverage {
	public static void main(String args[])
	   {
	     
	        int mark[] = new int[5],i;
	        float sum=0,avg; 
	      
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Number of Students: ");
	        int s = sc.nextInt();
	        for(int j=1;j<=s;j++) {
	        System.out.print("Enter marks for "+j+" Student 5 Subjects : ");
	        for(i=0; i<5; i++)
	        {
	            mark[i] = sc.nextInt();
	     
	            sum = sum + mark[i];
	           break;
	        }
	        System.out.println("Total Marks of "+j+" Student is "+sum);
	        
	         avg= sum/5;
	 
	       
	    System.out.println("Average Marks of "+j+" Stduent = " +avg);
	    }
	   }

}
