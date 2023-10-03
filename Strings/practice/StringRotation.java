package com.kodnest.Strings.practice;
import java.util.*;
public class StringRotation {
	public static boolean areRotation(String s1,String s2)
	{
		if(s1.length()!=s2.length())
		{
			return false;
		}
		String combined=s1+s1;
		return combined.contains(s2);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter two strings");
		String s1=scan.nextLine();
		String s2=scan.nextLine();
		
		if(areRotation(s1,s2))
		{
			System.out.println(s2+" is a rotation of "+s1);
		}
		else
		{
			System.out.println(s2+" is not a rotation of "+s1);
		}
	}

}
