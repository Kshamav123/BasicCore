package com.basiccore;

import java.util.Scanner;

public class SwapNo {
	public static void swapNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number: "); // user input
		int a = sc.nextInt();
		System.out.println("Enter the Second Number: "); // user input
		int b = sc.nextInt();
		int temp;
		System.out.println("Before swap: a = " + a + " b = " + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swap: a = " + a + " b = " + b);
		sc.close();
	}

}
