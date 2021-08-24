package com.basiccore;

import java.util.Scanner;

public class Alphabet {
	public static void alphabetVC() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Alphabet: "); 
		char ch = sc.next().charAt(0);
		if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
				|| ch == 'u' || ch == 'U')
			System.out.println(ch + " is a Vowel.");
		else
			System.out.println(ch + " is a Consonant.");
		sc.close();
	}

}
