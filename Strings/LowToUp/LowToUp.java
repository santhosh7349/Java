package com.kodnest.Strings.LowToUp;

public class LowToUp {
	String convert(String s1)
	{
		char[] arr=s1.toCharArray();
		for(int i=0;i<=arr.length-1;i++)
		{
			if(Character.isLowerCase(arr[i]))
			{
				arr[i]=Character.toUpperCase(arr[i]);
			}
		}		
		return new String(arr);
	}
}
