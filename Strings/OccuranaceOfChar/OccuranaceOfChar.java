package com.kodnest.Strings.OccuranaceOfChar;

public class OccuranaceOfChar {
	void Occuranace(String s1)
	{
		String s2="";
		for(int i=0;i<=s1.length()-1;i++)
		{
			if(s2.contains(String.valueOf(s1.charAt(i)))==false)
			{
				s2=s2+s1.charAt(i);
			}
		}
		System.out.println(s2);
		
		
		for(int i=0;i<=s2.length()-1;i++)
		{
			int count=0;
			for(int j=0;j<=s1.length()-1;j++)
			{
				if(s2.charAt(i)==s1.charAt(j))
				{
					count++;
				}	
			}
			System.out.println("the character "+s2.charAt(i)+" in string is present "+count+" times");
			
		}
	}

}
