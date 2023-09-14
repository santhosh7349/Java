package com.kodnest.practice.ArmStrong;

public class ArmStrong {
	int count(int n)
	{
		int original=n;
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		return count;
	}
	
	int power(int base,int exp)
	{
		int value=1;
		for(int i=1;i<=exp;i++)
		{
			value=value*base;
		}
		return value;
	}
	
	int check(int n)
	{
		int sum=0;
		int original=n;
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+power(rem,count(original));
			n=n/10;
		}
		return sum;
	}

}
