package com.kodnest.patterns.Assignment25;

public class Pattern25 {
	public static void main(String[] args) {
		for(int i=1;i<=6;i++)
		{
			for(int j=6;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=5;i>=1;i--)
		{
			for(int j=6;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
