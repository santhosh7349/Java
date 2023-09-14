package com.kodnest.practice.MultiplyElements;

public class MultiplyElements {
	static int multiply(int[] arr)
	{
		int prod=1;
		for(int i=0;i<=arr.length-1;i++)
		{
			prod=prod*arr[i];
		}
		return prod;
	}

}
