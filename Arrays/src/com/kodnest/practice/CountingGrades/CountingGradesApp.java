package com.kodnest.practice.CountingGrades;
import java.util.*;
public class CountingGradesApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the class Strength");
		int[] arr=new int[scan.nextInt()];
		
		System.out.println("Enter marks of each student");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		int res=CountingGrades.count(arr);
		
		System.out.println("The no of students scored above 75 Grade is "+res);
	}

}
