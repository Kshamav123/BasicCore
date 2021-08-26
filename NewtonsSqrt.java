package com.logical;

import java.util.Scanner;

public class NewtonsSqrt {
	public static void sqRt() {
		System.out.println("Enter the number whose square root to be found");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		double epsilon = 1e-15; 
		double t = n; 

		while (Math.abs(t - n / t) > epsilon * t) {
			t = (n / t + t) / 2.0;
		}
		
		System.out.println("square root is " + t);

	}
}