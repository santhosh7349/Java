package com.kodnest.Strings.LowToUp;

import java.util.Scanner;

public class LowToUpApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a string");
		String str=scan.nextLine();
		
		LowToUp ltu=new LowToUp();
		String res=ltu.convert(str);
		
		System.out.println("converted string:"+res);
		
	}


}
