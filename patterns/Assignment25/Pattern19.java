package com.kodnest.patterns.Assignment25;

public class Pattern19 {
	public static void main(String[] args) {
		for(int i=1;i<=6;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(i==1||i==6||j==1||(j==3&&i==6))
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}


