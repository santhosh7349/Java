package com.kodnest.practice.SmallestNo;

public class SmallestNo {
	int smallestNo(int[] arr)
	{
		int small = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<small)
			{
				small=arr[i];
			}
		}
		return small;
	}

}
