package com.kodnest.practice.SumOfPositive;
import java.util.*;
public class SumOfPositiveApp {
	public int SumOfPositive(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=0) 
			{
				sum=sum+arr[i];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the array length");
		int[] arr=new int[scan.nextInt()];
		
		System.out.println("Enter the no of transcations");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		SumOfPositiveApp spa=new SumOfPositiveApp();
		int res=spa.SumOfPositive(arr);
		
		System.out.println("The total of positive amount is "+res);
		
	}

}
