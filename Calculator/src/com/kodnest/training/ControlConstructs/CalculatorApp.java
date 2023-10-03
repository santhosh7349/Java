package com.kodnest.training.ControlConstructs;
import java.util.*;
public class CalculatorApp {
	public static void main(String[]args)
	{
		Calculator ct=new Calculator();
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.println("+--->Addition");
			System.out.println("- --->subtraction");
			System.out.println("*--->multiplicaion");
			System.out.println("/--->division");
			System.out.println("%--->remainder");
			System.out.println("^--->square");
			System.out.println("!--->To STOP");
			char ch=scan.next().charAt(0);
		
		
			switch(ch)
			{
			case'+':ct.addition();
			break;
			case'-':ct.subtraction();
			break;
			case'*':ct.multiplication();
			break;
			case'/':ct.division();
			break;
			case'%':ct.remainder();
			break;
			case'^':ct.square();
			break;
			case'!':System.out.println("Tata bye bye gaya");
			return;
			default:System.out.println("wrong input");
			}
		}
	}

}
