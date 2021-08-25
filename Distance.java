package com.FunctionalPrograms;

public class Distance {
	public static void distance(int x, int y)
	
	{
		double d=Math.sqrt(Math.pow(x,x)+Math.pow(y,y));
		System.out.println("Euclidean Distance is : "+d);
	}
	
	public static void main(String[] args) {
		
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		distance(x,y);

}
}
