package com.basiccore;

import java.util.Scanner;

public class LargestNo {
	public static void largestNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int a = sc.nextInt();
		System.out.println("Enter the Second Number: ");
		int b = sc.nextInt();
		System.out.println("Enter the Third Number: ");
		int c = sc.nextInt();

		int largest = ((a > b) ? a : b) > c ? ((a > b) ? a : b) : c;
		System.out.println(largest + " is the Largest number amongst the three.");

	}
}
