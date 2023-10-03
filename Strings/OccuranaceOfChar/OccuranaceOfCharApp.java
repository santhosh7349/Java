package com.kodnest.Strings.OccuranaceOfChar;
import java.util.*;
public class OccuranaceOfCharApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a String");
		String str=scan.nextLine();
		
//		OccuranaceOfChar oc=new OccuranaceOfChar();
//		oc.Occuranace(str);
		
		OccuranceOfChar2ndType oc2=new OccuranceOfChar2ndType();
		oc2.occuranace(str);
	}
}
