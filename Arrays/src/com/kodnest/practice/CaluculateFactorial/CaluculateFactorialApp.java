package com.kodnest.practice.CaluculateFactorial;
import java.util.*;
public class CaluculateFactorialApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter array length");
		int[] arr=new int[scan.nextInt()];
		
		System.out.println("Enter array elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Enter position to find factorial of number in that position");
		int pos=scan.nextInt();
		
		if(pos>=0&&pos<arr.length)
		{
			CaluculateFactorial cf=new CaluculateFactorial();
			int res=cf.factorial(arr[pos]);
			System.out.println("The factorial of given number is:"+res);
		}
		else
		{
			System.out.println("Give a correct position between 0 and "+(arr.length-1));
		}		
	}

}
