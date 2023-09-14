package com.kodnest.practice.CalculateDuplicates;
import java.util.*;
public class CalculateDuplicates {
	
	int[] checkDuplicate(int[] arr)
	{
		ArrayList<Integer> duplicate=new ArrayList<Integer>();
		System.out.println("Duplicate elements are:");
		
		for(int i=0;i<=arr.length-2;i++)
		{	
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]==arr[j])				
				{
					duplicate.add(arr[i]);
				}
			}
		}
		
		int[] res=new int[duplicate.size()];
		for(int i=0;i<duplicate.size();i++)
		{
			res[i]=duplicate.get(i);
		}
		return res;
	}

}
