package com.kodnest.Strings.DisplayAllSubString;

public class DisplayAllSubString {
	void display(String s1)
	{
		
		for(int i=0;i<=s1.length()-1;i++)
		{
			String temp="";
			for(int j=i;j<=s1.length()-1;j++)
			{
				temp=temp+s1.charAt(j);
				System.out.println(temp);
			}
		}
		
		
	}

}
