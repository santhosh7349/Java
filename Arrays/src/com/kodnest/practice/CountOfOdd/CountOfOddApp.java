package com.kodnest.practice.CountOfOdd;
import java.util.*;
public class CountOfOddApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the array length");
		int[] arr=new int[scan.nextInt()];
		
		System.out.println("Enter array elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		CountOfOddApp odd =new CountOfOddApp();
		int res=odd.count(arr);
		
		System.out.println("The total no odd numbers in array is "+res);
		
	}
	int count(int[] arr)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				count++;
			}
		}
		return count;
	}

}
