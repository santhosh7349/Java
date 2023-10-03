package com.kodnest.Strings.practice;
import java.util.*;
public class PrintCharOfOddIndex {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a string");
		String str=scan.nextLine();
		
		System.out.println("Characters at odd indicies are:");
		for(int i=0;i<=str.length()-1;i+=2)
		{
			System.out.println(str.charAt(i));
		}
	}
}
