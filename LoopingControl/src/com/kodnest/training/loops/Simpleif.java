package com.kodnest.training.loops;
import java.util.*;
public class Simpleif {
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int i=scan.nextInt();
		
		if(i>0)
		{
			System.out.println("good morning");
			if(i>5)
			{
				System.out.println("good afternoon");
				if(i>10)
				{
					System.out.println("good night");
				}
			}
		}
		scan.close();
	}
}
