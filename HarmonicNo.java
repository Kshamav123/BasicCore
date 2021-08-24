package com.basiccore;

import java.util.Scanner;

public class HarmonicNo {
	public static void harmonicNo() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Nth Harmonic number: "); 
	int N= sc.nextInt();
	float sum = 1; 
	
	
	for(int i=2 ; i<=N ; i++) 
	{
		sum += (float) 1/i;
		
	}
	System.out.println(" The value of "+ N + " harmonic(s) is/are: " + sum);
	sc.close();
}
}



