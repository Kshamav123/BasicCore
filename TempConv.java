package com.logical;

import java.util.Scanner;

public class TempConv {
	public static void temp() {

	    double f,c;
             	    Scanner sc=new Scanner(System.in);
	    System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
                   int choose=sc.nextInt();
	    switch(choose)
	    {
	    case 1:  System.out.println("Enter  Fahrenheit temperature");
                   	  f=sc.nextDouble();
	    	  c=(f-32)*5/9;
	    	  System.out.println("Celsius temperature is = "+c);
		  break;
	    case 2:  System.out.println("Enter  Celsius temperature");
                   	  c=sc.nextDouble();
	    	  f=((9*c)/5)+32;
	    	  System.out.println("Fahrenheit temperature is = "+f);
		  break;
	   default:  System.out.println("please choose valid choice");
	   }  
	}

	

}
