package com.kodnest.Strings.OccuranaceOfChar;

public class OccuranceOfChar2ndType {
	void occuranace(String s1)
	{
		char[] arr=s1.toCharArray();
		
		for(int i=0;i<=arr.length-2;i++)
		{
			if(arr[i]!=' ')
			{
				int count=1;
				for(int j=i+1;j<=arr.length-1;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
						arr[j]=' ';
					}
				}
				System.out.println("the character "+arr[i]+" in string is present "+count+" times");
			}
			
		}
	}

}
