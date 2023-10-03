package com.kodnest.Strings.ReversetheWords;

import java.util.Scanner;

public class ReverseOnlyWordsApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a string");
		String str=scan.nextLine();
		
		ReverseOnlyWords rws=new ReverseOnlyWords();
		String res=rws.reverse(str);
		
		System.out.println("Reversed String:"+res);
	}

}
