package com.kodnest.Strings.ReverseWithoutSpaces;
import java.util.*;
public class ReverseWithoutSpacesApp {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a string");
		String str=scan.nextLine();
		
		ReverseWithoutSpaces rws=new ReverseWithoutSpaces();
		String res=rws.reverse(str);
		
		System.out.println("Reversed String:"+res);
	}

}
