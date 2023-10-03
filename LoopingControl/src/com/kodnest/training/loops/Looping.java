package com.kodnest.training.loops;
import java.util.*;
public class Looping {
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the energy level");
		int n=scan.nextInt();
		int i=1;
		while(i<=n)
		{
			System.out.println("Kodman is fighting at energy level of "+i);
			i++;
		}
		System.out.println("-----------------------------------------");
		System.out.println("kodman at died when energy level became "+i);
	}

}
