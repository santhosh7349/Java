package com.kodnest.IMStrings.Intialization;

public class Intialization {
	public static void main(String[] args) {
		
		String s1="RAMA";
		System.out.println(s1);
		
		String s2=new String("SITA");
		System.out.println(s2);
		
		char ch[]= {'H','A','N','U','M','A'};
		String s3=new String(ch);
		System.out.println(s3);
		
		char ch2[]=new char[9];
		ch2[0]='L';
		ch2[1]='A';
		ch2[2]='K';
		ch2[3]='S';
		ch2[4]='H';
		ch2[5]='M';
		ch2[6]='A';
		ch2[7]='N';
		ch2[8]='A';
		String s4=new String(ch2);
		System.out.println(s4);
	}
}
