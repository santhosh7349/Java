package com.kodnest.Strings.cancatenation;

import java.util.Scanner;

import com.kodnest.Strings.Length.Length;

public class CancatenationApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter two strings");
		String s1=scan.nextLine();
		String s2=scan.nextLine();
		
		Cancatenation cat=new Cancatenation();
		String res=cat.cancat(s1,s2);
		
		if(res!=null)
		{
			System.out.println("cancatenated string is:"+res);
		}
		else
		{
			System.out.println("Strings are not equal");
		}
		
		
	}

}
