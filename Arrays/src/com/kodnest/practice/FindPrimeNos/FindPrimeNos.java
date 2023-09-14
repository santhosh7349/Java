package com.kodnest.practice.FindPrimeNos;

public class FindPrimeNos {
	public void findPrime(int[] arr) {
		System.out.println("Prime numbers in array are:");
		for(int i=0;i<=arr.length-1;i++)
		{
			int res=checkPrime(arr[i]);
			if(res!=0)
			{
				System.out.println(res);
			}
		}
	}
	static int checkPrime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return 0;
			}
		}
		return n;
	}
}
