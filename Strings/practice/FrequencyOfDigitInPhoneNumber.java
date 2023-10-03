package com.kodnest.Strings.practice;
import java.util.Scanner;

class FrequencyOfDigitInPhoneNumber{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter phone number");
		String phoneNo=scan.nextLine();
		
		char[] phone=phoneNo.toCharArray();
		int[] freq=new int[10];
		
		for(char i=0;i<=phone.length-1;i++)
		{
			if(Character.isDigit(phone[i]))
			{
				int ph=phone[i]-'0';
				freq[ph]++;
			}
		}
		
		for(int i=0;i<=freq.length-1;i++)
		{
			if(freq[i]>0)
			{
				System.out.println("Digit "+i+" occured "+freq[i]+" times");
			}
		}
	}
}
