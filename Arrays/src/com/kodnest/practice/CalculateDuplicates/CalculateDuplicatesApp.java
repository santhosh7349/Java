package com.kodnest.practice.CalculateDuplicates;
import java.util.*;
public class CalculateDuplicatesApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter array length");
		int[] arr=new int[scan.nextInt()];
		
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		CalculateDuplicates cd=new CalculateDuplicates();
		int res[]=cd.checkDuplicate(arr);
		
		for(int x:res)
		{
			System.out.print(x+" ");
		}
		
	}

}
