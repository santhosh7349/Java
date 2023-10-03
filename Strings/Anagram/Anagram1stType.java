package com.kodnest.Strings.Anagram;

public class Anagram1stType {
	String check(String s1,String s2)
	{
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length()==s2.length())
		{
			for(int i=0;i<=s1.length()-1;i++)
			{
				if(s2.contains(String.valueOf(s1.charAt(i))))
				{
					continue;
				}
				else
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
