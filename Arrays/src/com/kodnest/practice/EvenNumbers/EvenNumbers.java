package com.kodnest.practice.EvenNumbers;

public class EvenNumbers {
	int evenDetect(int[] arr)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				count++;
			}
		}
		return count;
	}

}
