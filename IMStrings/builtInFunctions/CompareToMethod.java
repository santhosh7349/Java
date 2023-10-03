package com.kodnest.IMStrings.builtInFunctions;

public class CompareToMethod {
	public static void main(String[] args) {
		String s1="Sachin";
		String s2="Saurav";
		
		//System.out.println(s1.compareTo(s2));
		
		if(s1.compareTo(s2)>0)
		{
			System.out.println("String s1 is greater than String s2");
			
		}
		else if(s1.compareTo(s2)<0)
		{
			System.out.println("String s2 is greater than String s1");
		}
		else
		{
			System.out.println("Strings s1 and s2 are equal");
		}
	}

}
