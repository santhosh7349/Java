package com.kodnest.patterns.level5;

public class Assignment4 {
	public static void main(String[] args) {
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if((i==1&&j==3)||(i==2&&j==2)||(i==2&&j==4)||i==3)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1||i==5||j==1||j==5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}