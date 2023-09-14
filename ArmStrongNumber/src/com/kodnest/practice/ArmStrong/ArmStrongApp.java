package com.kodnest.practice.ArmStrong;
import java.util.*;
public class ArmStrongApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n=scan.nextInt();
		
		
		
		ArmStrong as=new ArmStrong();
		int res=as.check(n);
		
		
		if(res==n)
		{
			System.out.println("Given number is armstrong number");
		}
		else
		{
			System.out.println("Given number is not armstrong number");
		}
	}

}
