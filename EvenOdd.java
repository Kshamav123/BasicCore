package com.basiccore;

import java.util.Scanner;

public class EvenOdd {
	public static void evenOdd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: "); // user input
		int a = sc.nextInt();
		if (a % 2 == 0)
			System.out.println(a + " is an Even Number");
		else
			System.out.println(a + " is an Odd Number");
		sc.close();
	}
}
