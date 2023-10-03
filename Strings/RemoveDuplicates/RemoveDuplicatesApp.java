package com.kodnest.Strings.RemoveDuplicates;
import java.util.*;
public class RemoveDuplicatesApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a String");
		String str=scan.nextLine();
		System.out.println("The original string:"+str);
		
		RemoveDuplicates rd=new RemoveDuplicates();
		String res=rd.remove(str);
		
		System.out.println("The altered String is:"+res);
	}

}
