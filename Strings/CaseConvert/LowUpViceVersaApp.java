package com.kodnest.Strings.CaseConvert;

import java.util.Scanner;

public class LowUpViceVersaApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a string");
		String str=scan.nextLine();
		
		LowUpViceVersa luv=new LowUpViceVersa();
		String res=luv.convert(str);
		
		System.out.println("converted string:"+res);
		
	}

}
