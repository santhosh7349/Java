package com.kodnest.Strings.CountOfUpAndLow;
import java.util.*;
public class CountOfUpAndLowApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a string");
		String str=scan.nextLine();
		
		CountOfUpAndLow cul=new CountOfUpAndLow();
		cul.count(str);
		
	}

}
