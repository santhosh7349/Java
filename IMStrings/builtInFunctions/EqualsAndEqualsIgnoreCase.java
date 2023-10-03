package com.kodnest.IMStrings.builtInFunctions;

public class EqualsAndEqualsIgnoreCase {
	static void reference()
	{
		String s1="Rama";
		String s2="RAMA";
		if(s1==s2)
		{
			System.out.println("References are equal");
		}
		else
		{
			System.out.println("References are unequal");
		}
		
		if(s1.equals(s2))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are unequal");
		}
		
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are unequal");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		reference();
	}

}
