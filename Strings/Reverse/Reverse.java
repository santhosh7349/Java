package com.kodnest.Strings.Reverse;

public class Reverse {
	String reverse(String s1)
	{
		char[] arr1=s1.toCharArray();
		char[] arr2=new char[arr1.length];
		
		int j=0;
		for(int i=arr1.length-1;i>=0;i--)
		{
			arr2[j]=arr1[i];
			j++;
		}
		
		s1=new String(arr2);
		return s1 ;
	}

}
