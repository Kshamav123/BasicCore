package com.logical;

import java.util.Scanner;

public class Fibonacci {
	public static void fibonacci() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms you want in Fibonnaci series: "); 
		int n= sc.nextInt(); 
		int fib1 = 0; 
		int fib2 = 1; 
		int sum=0;
		
		System.out.println(fib1 + " " + fib2 + " ");
		
		for(int i=2; i<n; i++)
		{
			sum = fib1 + fib2;
			System.out.println(sum + " ");
			fib1 = fib2;
			fib2 = sum;
		}
	}

}
