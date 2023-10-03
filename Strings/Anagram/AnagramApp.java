package com.kodnest.Strings.Anagram;
import java.util.*;
public class AnagramApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter two String");
		String str1=scan.nextLine();
		String str2=scan.nextLine();
		
		//Anagram1stType an1=new Anagram1stType();
		//String res=an1.check(str1,str2);
		
//		Anagram2ndType an2=new Anagram2ndType();
//		String res=an2.check(str1,str2);
		
		Anagram3rdType an3=new Anagram3rdType();
		String res=an3.check(str1,str2);
		
		
		System.out.println("Given String is "+res);
		
		
		
	}

}
