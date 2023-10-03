package com.kodnest.training.loops;

import java.util.Scanner;

public class NestedIfElse {
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Student Details");
		
		System.out.println("Enter the age");
		int age=scan.nextInt();
		
		System.out.println("Enter the cgpa");
		int cgpa=scan.nextInt();
		
		if(age>18)
		{
			if(cgpa>=7)
			{
				System.out.println("Eligible to apply for job");
			}
			else
			{
				System.out.println("not eligible");
			}
		}
		else
		{
			System.out.println("pls complete the degree first");
		}
	}

}
