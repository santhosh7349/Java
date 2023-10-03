package com.kodnest.Strings.Length;
import java.util.*;

public class LengthApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter two strings");
		String s1=scan.nextLine();
		String s2=scan.nextLine();
		
		Length len=new Length();
		boolean res=len.lengthFind(s1, s2);
		
		if(res==true)
		{
			System.out.println("String are of same length");
		}
		else
		{
			System.out.println("String are of different length");
		}
		
		
	}

}
