package com.kodnest.IMStrings.builtInFunctions;


public class EqualToOperatorAndEqualsMethod {
	static void reference1()
	{
		String s1="Rama";
		String s2="Rama";
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
		System.out.println();
	}
	static void reference2()
	{
		String s3=new String("Rama");
		String s4=new String("Rama");
		if(s3==s4)
		{
			System.out.println("References are equal");
		}
		else
		{
			System.out.println("References are unequal");
		}
		
		if(s3.equals(s4))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are unequal");
		}
		System.out.println();
	}
	static void reference3()
	{
		String s5="Rama";
		String s6=new String("Rama");
		if(s5==s6)
		{
			System.out.println("References are equal");
		}
		else
		{
			System.out.println("References are unequal");
		}
		
		if(s5.equals(s6))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are unequal");
		}
		System.out.println();
	}
	
	static void reference4()
	{
		String s7="Rama";
		String s8="Sita";
		String s9="Rama"+"Sita";
		String s10="Rama"+"Sita";
		if(s9==s10)
		{
			System.out.println("References are equal");
		}
		else
		{
			System.out.println("References are unequal");
		}
		
		if(s9.equals(s10))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are unequal");
		}
		System.out.println();
	}
	
	static void reference5()
	{
		String s7="Rama";
		String s8="Sita";
		String s9=s7+s8;
		String s10=s7+s8;
		if(s9==s10)
		{
			System.out.println("References are equal");
		}
		else
		{
			System.out.println("References are unequal");
		}
		
		if(s9.equals(s10))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are unequal");
		}
		System.out.println();
	}
	
	static void reference6()
	{
		String s1="Rama";
		String s2=s1;
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
		System.out.println();
	}
	
	
	public static void main(String[] args) 
	{
		reference1();
		reference2();
		reference3();
		reference4();
		reference5();
		reference6();
		
	}
}
