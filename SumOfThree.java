package com.FunctionalPrograms;

import java.util.Scanner;

public class SumOfThree {
	public static void create(int[] arr1, int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of the array : ");
		for(int j=0;j<n;j++) {
				arr1[j] = sc.nextInt();
			}
	}
	

	public static void sumOfThreeInt(int[] arr, int n) {
		int flag = 0;
		int count = 0;
		for(int i=0; i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;j<n;j++) {
					if(arr[i]+arr[j]+arr[k]==0) {
						count++;
						System.out.println("Triplets are "+arr[i]+","+arr[j]+","+arr[k]);
						flag = 1;
					}						
				}
			}
		}
		if(flag == 0) 
			System.out.println("No triplets found");
		System.out.println("Total number of triplet pairs : "+count);
	}

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of elements to be entered in the array : ");
	int n = sc.nextInt(); 
	int[] arr1 = new int[n];
	create(arr1,n);
	sumOfThreeInt(arr1,n);
}

}
