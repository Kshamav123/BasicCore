package com.logical;

import java.util.Scanner;

public class ReverseNo {
	public static void reverseNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to reverse: ");
		int num = sc.nextInt();
		int reverse = 0;
		int digit;

		while (num != 0) {
			digit = num % 10;
			reverse = (reverse * 10) + digit;
			num = num / 10;
		}
		System.out.println("The number after reversing: " + reverse);
	}
}
