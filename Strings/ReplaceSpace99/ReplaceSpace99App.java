package com.kodnest.Strings.ReplaceSpace99;

import java.util.Scanner;

public class ReplaceSpace99App {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a String");
		String str=scan.nextLine();
		System.out.println("The original string:"+str);
		
		ReplaceSpace99 rs=new ReplaceSpace99();
		String res=rs.replace(str);
		
		System.out.println("The altered String is:"+res);
	}

}
