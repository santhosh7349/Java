package com.kodnest.Strings.ReverseWithoutSpaces;

public class ReverseWithoutSpaces 
{
	String reverse(String s1)
	{
		char[] arr=s1.toCharArray();
		char[] rev=new char[arr.length];

		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==' ')
			{
				rev[i]=arr[i];
			}
		}
		
		int j=arr.length-1;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]!=' ')
			{
				if(rev[j]==' ')
				{
					j--;
				}
				rev[j]=arr[i];
				j--;
			}
			
		}
		return new String(rev);
	}

}
