package com.logical;

import java.util.Scanner;

public class PrimeNo {
	public static void primeNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int flag = 1;

		if (num == 0 || num == 1) {
			System.out.println(" Not Valid.");
		}

		else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					System.out.println(num + " is not a Prime Number (Composite Number).");
					flag = 0;
					break;
				}
			}
			if (flag == 1)
				System.out.println(num + " is a Prime Number.");
		}

	}
}
