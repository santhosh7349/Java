package com.kodnest.training.loops;

public class WhileLoop {
	public static void main(String []args)
	{
		int i=1;
		while(i<10)
		{
			System.out.println(i);
			i++;
			while(i>=10&&i<15)
			{
				System.out.println(i);
				i++;
			}
		}
		
		
	}
}