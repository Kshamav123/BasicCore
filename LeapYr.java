package com.basiccore;

import java.util.Scanner;

public class LeapYr {
	public static void leapYr() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = sc.nextInt();

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			System.out.println(" Year " + year + " is a leap year.");
		else
			System.out.println(" Year " + year + " is not a leap year.");
		sc.close();
	}

}
