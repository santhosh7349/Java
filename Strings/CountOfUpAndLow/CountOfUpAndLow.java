package com.kodnest.Strings.CountOfUpAndLow;

public class CountOfUpAndLow {
	void count(String s1)
	{
		int lcount=0;
		int ucount=0;
		
		for(int i=0;i<=s1.length()-1;i++)//using builtin functions
		{
			if(Character.isUpperCase(s1.charAt(i)))
			{
				ucount++;
			}
			else
			{
				lcount++;
			}
		}
		
		
//		for(int i=0;i<=s1.length()-1;i++)//without using builtin functions
//		{
//			if((int)s1.charAt(i)>=97 && (int)s1.charAt(i)<=122)
//			{
//				lcount++;
//			}
//			else
//			{
//				ucount++;
//			}
//		}
		System.out.println("Count of uppercase letters in string are:"+ucount);
		System.out.println("Count of Lowercase letters in string are:"+lcount);
	}

}
