package com.FunctionalPrograms;

import java.io.PrintWriter;
import java.util.Scanner;

public class TwodArray {
	public static void create(int[][] arr1, int m, int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
	}
	
	
	public static void print(int[][] arr, int m, int n) {
		System.out.println("The elements of the array are : ");
		PrintWriter writer = new PrintWriter(System.out);    
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				writer.write(+arr[i][j]+"\t");
				writer.flush(); 
			}
			writer.write("\n");
			writer.flush();
		}
		writer.close();	
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows (M)  for a MxN Array : ");
		int m = sc.nextInt(); 
		System.out.println("Enter the number of coloumns (N)  for a MxN Array : ");
		int n = sc.nextInt(); 
		int[][] arr = new int[m][n];
		create(arr,m,n); 
		print(arr,m,n);  

	}

}
