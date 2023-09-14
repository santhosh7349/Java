package com.kodnest.practice.FindPrimeNos;
import java.util.*; 
public class FindPrimeNosApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter array length");
		int[] arr=new int[scan.nextInt()];
		
		System.out.println("Enter array elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		FindPrimeNos fpn=new FindPrimeNos();
		fpn.findPrime(arr);
		
	}

}
