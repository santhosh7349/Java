package com.kodnest.Strings.Reverse;
import java.util.*;
public class ReverseApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a string");
		String s1=scan.next();
		
		Reverse rev=new Reverse();
		String result=rev.reverse(s1);
		
		System.out.println("The given String in reverse direction:"+result);
	}

}
