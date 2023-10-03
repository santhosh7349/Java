package com.kodnest.Strings.practice;
import java.util.*;
public class InsertChartAt3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a string");
		String str=scan.next();
		
		System.out.println("Enter the character to be inserted");
		char ch=scan.next().charAt(0);
		
		String result=insert(str,ch,2);
		System.out.println("The altered string is "+result);
	}
	
	static String insert(String str,char ch,int index)
	{
		if(index<0 || index>str.length())
		{
			return str;
		}
		
		StringBuilder sb=new StringBuilder(str);
		sb.insert(index,ch);
		return sb.toString();
	}

}
