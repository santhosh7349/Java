package com.kodnest.practice.TemperatureRecords;
import java.util.*;
public class TemperatureRecordsApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter number of days");
		int[] week=new int[scan.nextInt()];
		
		System.out.println("Enter the temperature of all "+week.length+" days");
		for(int i=0;i<week.length;i++)
		{
			week[i]=scan.nextInt();
		}
		
		System.out.println("The various of temperature in a week");
		for(int i=0;i<week.length;i++)
		{
			System.out.println(week[i]);
		}
		
		TemperatureRecords tr=new TemperatureRecords();
		int avg=tr.average(week,week.length);
		
		System.out.println("The average of temperatures of "+week.length+" days is "+avg);
	}

}
