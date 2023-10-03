package com.kodnest.Strings.Anagram;

public class Anagram3rdType {
	String check(String s1,String s2)
	{
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length()==s2.length()) 
		{
			char[] arr1=s1.toCharArray();
			char[] arr2=s2.toCharArray();
			
			for(int i=0;i<=arr1.length-1;i++)
			{
				for(int j=0;j<=arr2.length-1;j++)
				{
					if(arr1[i]==arr2[j])
					{
						arr2[j]='*';
					}
				}
			}
			for(int i=0;i<=arr2.length-1;i++)
			{
				if(arr2[i]!='*')
				{
					return "Not Anagram";
				}
			}
			return "Anagram";
		}
		else
		{
			return "Not Anagram";
		}
		
	}

}
