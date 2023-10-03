package com.kodnest.training.ControlConstructs;
import java.util.*;
class Calculator {
	Scanner scan=new Scanner(System.in);
	
	 void addition()
	{
		System.out.println("Enter two numbers for addition");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Addition of"+a+"and"+b+"is"+(a+b));
	}
	void subtraction()
	{
		System.out.println("Enter two numbers for subtraction");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("subtraction of"+a+"and"+b+"is"+(b-a));
	}
	void multiplication()
	{
		System.out.println("Enter two numbers for multiplication");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("multiplication of"+a+"and"+b+"is"+(a*b));
	}
	void division()
	{
		System.out.println("Enter two numbers for division");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("division of"+a+"and"+b+"is"+(b/a));
	}
	void remainder()
	{
		System.out.println("Enter two numbers for remainder");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("remainder of"+a+"and"+b+"is"+(a%b));
	}
	void square()
	{
		System.out.println("Enter a number for square");
		int a=scan.nextInt();
		System.out.println("Square of"+a+"is"+(a*a));
	}

}
