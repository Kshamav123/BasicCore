package com.logical;

import java.util.Scanner;

public class MonthlyPay {
	public static void monthlyPay() {
		
		Scanner a = new Scanner(System.in);
        
        double principal, rate, year, payment;
  
        System.out.print("Enter principal: ");
        principal = a.nextFloat();
      
        System.out.print("Enter rate: ");
        rate = a.nextFloat();
      
        System.out.print("Enter time in year: ");
        year = a.nextFloat();
      
        rate =rate/(12*100); 
        year = year*12; 
      
      payment= (principal*rate)/(1-Math.pow((1+rate),-year));
      
        System.out.print("Monthly payment is= "+payment+"\n");
                 
	}

}
