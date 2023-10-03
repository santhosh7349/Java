package com.kodnest.Recursion.Factorial;
import java.util.*;
public class FactorialApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n=scan.nextInt();
		
		Factorial ft=new Factorial();
		int res=ft.fact(n);
		
		System.out.println("The factorial of given number:"+res);
	}
	
	
	

}
