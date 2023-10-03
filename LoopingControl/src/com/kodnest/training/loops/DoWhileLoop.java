package com.kodnest.training.loops;

public class DoWhileLoop {
	public static void main(String []args)
	{
		int i=1;
		do
		{
			System.out.println(i);
			i++;
			do
			{
				System.out.println(i);
				i++;
			}while(i>=10&&i<=15);
		}while(i<10);
	}
}