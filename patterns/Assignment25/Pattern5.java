package com.kodnest.patterns.Assignment25;

public class Pattern5 {
	public static void main(String[] args) {
		int n=1;
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}
	}

}
