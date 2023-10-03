package com.kodnest.Strings.DisplayAllSubString;
import java.util.Scanner;
public class DisplayAllSubStringApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a String");
		String str=scan.nextLine();
		System.out.println("The original string:"+str);
		
		DisplayAllSubString dss=new DisplayAllSubString();
		dss.display(str);
		
		
	}

}
