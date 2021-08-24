package com.basiccore;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
	public static void flipCoin() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of times you want to flip a coin:");
		int n = sc.nextInt();
		float heads = 0;
		float tails = 0;
		double hPercentage = 0;
		double tPercentage = 0;

		Random rand = new Random();

		for (int i = 0; i < n; i++) {

			double number = rand.nextInt(2);
			System.out.println(" The result of Coin Flip in " + (i + 1) + " try is: " + number);
			if (number < 0.5)
				tails++;
			else
				heads++;
		}
		hPercentage = (heads / n) * 100;
		tPercentage = 100 - hPercentage;
		System.out.println(" % of times Heads turned up: " + hPercentage + " %");
		System.out.println(" % of times Tails turned up: " + tPercentage + " %");
	sc.close();
	}

}
