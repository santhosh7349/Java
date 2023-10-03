package com.kodnest.Strings.Anagram;

import java.util.Arrays;

public class Anagram2ndType {
	String check(String s1,String s2)
	{
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char[] arr1=s1.toCharArray();
		char[] arr2=s2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i=0;i<=arr1.length-1;i++)
		{
			if(arr1[i]!=arr2[i])
			{
				return "Not Anagram";
			}
		}
		return "Anagram";
	}

}
