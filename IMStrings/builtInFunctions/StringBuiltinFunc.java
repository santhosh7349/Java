package com.kodnest.IMStrings.builtInFunctions;

public class StringBuiltinFunc {
	public static void main(String[] args) {
		String name="Raja Ram Mohan Roy";
		
		name.toUpperCase();
		System.out.println(name);//we can't see the affected string until we store it in some variable.
		System.out.println("**********************************************");
		
		String s1=name.toUpperCase();
		System.out.println(s1);//here we can see the affected string(in upper case).
		System.out.println("***********************************************");
		
		name=name.toUpperCase();//now this becomes original string(updated one).
		System.out.println(name);//here we can see the affected string(in upper case) in same variable.
		System.out.println("***********************************************");
		
		System.out.println(name.toUpperCase());//we can also see the affected string by directly printing it.
		System.out.println(name.toLowerCase());//and also by directly printing the functions it won't affect the original string.
		System.out.println("***********************************************");
		
		System.out.println(name.charAt(0));
		System.out.println("***********************************************");
		
		System.out.println(name.indexOf('A'));
		System.out.println("***********************************************");
		
		System.out.println(name.contains("Rsm"));
		System.out.println(name.contains("Ram"));
		System.out.println(name.contains("RAM"));//it checks for the string from original string stored in "name" variable.
		System.out.println("***********************************************");
		
		System.out.println(name.substring(9));
		System.out.println(name.substring(9,14));
		System.out.println("***********************************************");
	}

}
