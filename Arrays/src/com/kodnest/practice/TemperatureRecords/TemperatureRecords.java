package com.kodnest.practice.TemperatureRecords;

public class TemperatureRecords {
	int average(int []arr,int n)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		return sum/n;
	}

}
