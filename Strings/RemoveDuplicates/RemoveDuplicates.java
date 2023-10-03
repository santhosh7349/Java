package com.kodnest.Strings.RemoveDuplicates;

public class RemoveDuplicates {
	String remove(String s1)
	{
		
		
		String s2="";
		
//		san:for(int i=0;i<=s1.length()-1;i++)
//		{
//			for(int j=0;j<=s2.length()-1;j++)
//			{
//				if(s1.charAt(i)==s2.charAt(j))
//				{
//					continue san;
//				}
//			}
//			s2=s2+s1.charAt(i);
//		}
		
		for(int i=0;i<=s1.length()-1;i++)
		{
			if(s2.contains(String.valueOf(s1.charAt(i)))==false)
			{
				s2=s2+s1.charAt(i);
			}
		}
		
		return s2;
	}

}
