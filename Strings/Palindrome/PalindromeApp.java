package com.kodnest.Strings.Palindrome;

import java.util.Scanner;

import com.kodnest.Strings.Reverse.Reverse;

public class PalindromeApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a string");
		String s1=scan.next();
		
		System.out.println("String before reversing:"+s1);
	
		
		Palindrome rev=new Palindrome();
		boolean res=rev.palin(s1);
		System.out.println();
		
		if(res==true)
		{
			System.out.println("The given String is palindrome");
		}
		else
		{
			System.out.println("The given String is not palindrome");
		}
		
		
		
	}

}
