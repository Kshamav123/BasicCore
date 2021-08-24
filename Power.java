package com.basiccore;

import java.util.Scanner;

public class Power {
	public static void power() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of times to iterate (<31) : "); 
		int N = sc.nextInt();
		int result = 0;

		
		for (int i = 1; i <= N; i++) {
			result = (int) Math.pow(2, i);
			System.out.println(" 2 ^ " + i + " = " + result);
			sc.close();
		}
	}

}
