package com.basiccore;

import java.util.Scanner;

public class factors {
	public static void factorNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to find Prime factors: "); 
		int n= sc.nextInt();
		
		while (n%2==0)
        {
            System.out.print(2 + " ");
            n /= 2;
        }
		sc.close();
 
        
        for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {
            while (n%i == 0)
            {
                System.out.print(i + " ");
                n /= i;
            }
        }
        
        if (n > 2)
            System.out.print(n);
	}
		
	}


