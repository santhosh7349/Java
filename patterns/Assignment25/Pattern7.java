package com.kodnest.patterns.Assignment25;

public class Pattern7 {
	public static void main(String[] args) {
		
		for(int i=1;i<=6;i++)
		{
			for (int j=5;j>=i;j--) {
                System.out.print("  ");
            }
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");		
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
