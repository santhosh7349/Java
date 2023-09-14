package com.kodnest.practice.EvenNumbers;
import java.util.*;
public class EvenNumbersApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the array length");
		int[] arr=new int[scan.nextInt()];
		
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		EvenNumbers en=new EvenNumbers();
		int res=en.evenDetect(arr);
		
		System.out.println("The number of even numbers in array is "+res);
	}
}
