package com.kodnest.IMStrings.builtInFunctions;
import java.util.*;
public class StringCopyAndReverse {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		char ch[]=new char[10];
		
		System.out.println("Enter 10 characters");
		for(int i=0;i<=ch.length-1;i++)
		{
			ch[i]=scan.next().charAt(0);
		}
		
		for(int i=0;i<=ch.length-1;i++)
		{
			System.out.println(ch[i]+" ");
		}
		System.out.println();
		
		char ch2[]=new char[ch.length];
		for(int i=0;i<=ch.length-1;i++)
		{
			ch2[i]=ch[i];
		}
		
		for(int i=0;i<=ch2.length-1;i++)
		{
			System.out.println(ch2[i]+" ");
		}
		System.out.println();
		
		//reversed array
		char ch3[]=new char[ch2.length];
		
//		int j=ch3.length-1;
//		for(int i=0;i<=ch2.length-1;i++)
//		{
//			ch3[j]=ch2[i];
//			j--;
//		}
		
		int j=0;
		for(int i=ch2.length-1;i>=0;i--)
		{
			ch3[j]=ch2[i];
			j++;
		}
		
		for(int i=0;i<=ch3.length-1;i++)
		{
			System.out.println(ch3[i]+" ");
		}
		System.out.println();
		
	}

}
