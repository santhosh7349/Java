package com.kodnest.Strings.UpToLow;

public class UpToLow {
	String convert(String s1)
	{
		char[] arr=s1.toCharArray();
		for(int i=0;i<=arr.length-1;i++)
		{
			if(Character.isUpperCase(arr[i]))
			{
				arr[i]=Character.toLowerCase(arr[i]);
			}
		}
		return new String(arr);	
	}
}
