package com.logical;

import java.util.Scanner;

public class PerfectNo {
	public static void perfectNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		int sum = 0;

		System.out.println("Factors are: ");
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				System.out.println(i + " ");
				sum += i;
			}
		}

		if (sum == n)
			System.out.println(n + " is a Perfect Number.");
		else
			System.out.println(n + " is not a Perfect Number.");

	}
}
