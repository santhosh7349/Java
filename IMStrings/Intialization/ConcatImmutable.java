package com.kodnest.IMStrings.Intialization;

public class ConcatImmutable {
	static void concat1() 
	{
		String s1="Rama";
		System.out.println(s1);
		
		String s2="Sita";
		System.out.println(s2);
		
		s1.concat(s2);
		System.out.println(s1);
		System.out.println();
	}
	
	static void concat2() 
	{
		String s1="Rama";
		System.out.println(s1);
		
		String s2="Sita";
		System.out.println(s2);
		
		s1=s1.concat(s2);
		System.out.println(s1);
		System.out.println();
	}
	public static void main(String[] args) {
		concat1();
		concat2();
	}
}
