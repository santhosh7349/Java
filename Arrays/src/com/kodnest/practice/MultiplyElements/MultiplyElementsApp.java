package com.kodnest.practice.MultiplyElements;
import java.util.*;
public class MultiplyElementsApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the array length");
		int[] arr=new int[scan.nextInt()];
		
		System.out.println("Enter array elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		int res=MultiplyElements.multiply(arr);
		
		System.out.println("The product of array elements is "+res);
	}

}
