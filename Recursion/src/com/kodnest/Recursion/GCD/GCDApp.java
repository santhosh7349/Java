package com.kodnest.Recursion.GCD;
import java.util.Scanner;
public class GCDApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		int m=scan.nextInt();
		int n=scan.nextInt();
		
		GCD gcd=new GCD();
		int res=gcd.findGcd(m,n);
		
		System.out.println("The factorial of given number:"+res);
	}
}
