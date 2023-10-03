package com.kodnest.Strings.Palindrome;

public class Palindrome {
	boolean palin(String s1)
	{
		char[] arr1=s1.toCharArray();
		char[] arr2=new char[arr1.length];
		
		int j=0;
		for(int i=arr1.length-1;i>=0;i--)
		{
			arr2[j]=arr1[i];
			j++;
		}
		
		String s=new String(arr2);
		System.out.println("String after reversing:"+s);
		
		if(s1.equals(s))
		{
			return true;
		}
		else
		{
			return false;
		}
//		if(s1.equalsIgnoreCase(s))
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
	}

}
