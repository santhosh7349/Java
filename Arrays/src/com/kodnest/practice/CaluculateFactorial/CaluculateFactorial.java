package com.kodnest.practice.CaluculateFactorial;

public class CaluculateFactorial {
	int factorial(int pos) {
		int fact=1;
		for(int i=1;i<=pos;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

}
