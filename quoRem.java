package com.basiccore;

import java.util.Scanner;

public class quoRem {
	public static void quorem(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Dividend: "); 
	int dividend= sc.nextInt();
	System.out.println("Enter the Divisor (!0): "); 
	int divisor= sc.nextInt();
	int quotient = dividend/divisor;
	int remainder = dividend % divisor;
	
	System.out.println("The Quotient of " + dividend + " / " + divisor + " is :" + quotient);
	System.out.println("The Remainder of " + dividend + " / " + divisor + " is :" + remainder);
	sc.close();
}

}

