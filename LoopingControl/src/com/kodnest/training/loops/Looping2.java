package com.kodnest.training.loops;

import java.util.Scanner;

public class Looping2 {
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the total pages");
		int n=scan.nextInt();
		int i=1;
		do
		{
			System.out.println("Kodman studied page "+i);
			i++;
		}while(i<=n);
		System.out.println("-----------------------------------------");
		System.out.println("kodman became bored at page no "+i);
		scan.close();
	}
}
