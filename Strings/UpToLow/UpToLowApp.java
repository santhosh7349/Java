package com.kodnest.Strings.UpToLow;

import java.util.Scanner;

import com.kodnest.Strings.CountOfUpAndLow.CountOfUpAndLow;

public class UpToLowApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a string");
		String str=scan.nextLine();
		
		UpToLow utl=new UpToLow();
		String res=utl.convert(str);
		
		System.out.println("converted string:"+res);
		
	}

}
