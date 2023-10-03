package com.kodnest.Recursion.GCD;

public class GCD {
	int findGcd(int m,int n)
	{
		if(n==0)
		{
			return m;
		}
		else
		{
			return findGcd(n,m%n);
		}
	}

}
