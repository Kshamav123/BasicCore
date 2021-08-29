package com.logical;

public class Gcalendar {
	public static void calendar(String s1, String s2, String s3) {
		int day=Integer.parseInt(s1);
		int month=Integer.parseInt(s2);
		int year=Integer.parseInt(s3);
		int y = year - (14 - month) / 12;
	    int x = y + y/4 - y/100 + y/400;
	    int m = month + 12 * ((14 - month) / 12) - 2;
	    int d = (day + x + (31*m)/12) % 7;
	    System.out.println("Day "+d);
	}

}