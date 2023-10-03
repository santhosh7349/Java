package com.kodnest.Strings.Unicode;

public class Unicode {
	static void unikod(String s1)
	{
//		char[] arr=s1.toCharArray();
//		for(int i=0;i<=arr.length-1;i++)
//		{
//			int code=arr[i];
//			System.out.println("The unicode of "+arr[i]+" is "+code);
//		}
		
		for(int i=0;i<=s1.length()-1;i++)
		{
			int code= s1.charAt(i);
			System.out.println("The unicode of "+s1.charAt(i)+" is "+code);
		}
	}
}
