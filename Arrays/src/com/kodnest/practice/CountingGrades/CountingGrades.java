package com.kodnest.practice.CountingGrades;

public class CountingGrades {
	static int count(int arr[])
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>75)
			{
				count++;
			}
		}
		return count;
	}

}
