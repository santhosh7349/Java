package com.kodnest.practice.SmallestNo;
import java.util.*;
public class SmallestNoApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter array length");
		int[] arr=new int[scan.nextInt()];
		
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		SmallestNo sn=new SmallestNo();
		int res=sn.smallestNo(arr);
		
		System.out.println("The smallest element in the given array is "+res);
	}

}
