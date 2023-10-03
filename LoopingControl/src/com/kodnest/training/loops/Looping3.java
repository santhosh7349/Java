package com.kodnest.training.loops;

import java.util.Scanner;

public class Looping3 {
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the total pages");
		int n=scan.nextInt();
		boolean bored=true;
		
		int i=1;
		do
		{
			System.out.println("Kodman studied page "+i);
			i++;
			System.out.println("Do you want to continue..?");
			bored=scan.nextBoolean();
		}while(bored);
		System.out.println("-----------------------------------------");
		System.out.println("kodman became bored at page no "+i);
		scan.close();
	}
}

