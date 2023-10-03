package com.kodnest.NonPrimitiveDataType.Arrays;
import java.util.*;
public class StudentApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("How many object do you want to create");
		int n=scan.nextInt();
		
		Student[] arr=new Student[n];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the id of student "+i);
			int id=scan.nextInt();
			System.out.println("Enter the name of student "+i);
			String name=scan.next();
			System.out.println("Enter the marks of student "+i);
			int marks=scan.nextInt();
			
			arr[i]=new Student(id,name,marks);
		}
		
		StudentSearchSort.studentArrayPrint(arr);
		
		System.out.println("Enter NAME to be searched using Linear Search");
		String name=scan.next();
		StudentSearchSort sss=new StudentSearchSort();
		boolean lSearchRes=sss.studentSearchElement(arr,name);
		if(lSearchRes==true)
		{
			System.out.println("Student "+name+" found");
		}
		else
		{
			System.out.println("Student not found");
		}
		
		boolean opt=true;
		while(opt)
		{
			System.out.println("To sort Enter");
			System.out.println("1--->BubbleSort to sort ID");
			System.out.println("2--->SelectionSort to sort MARKS");
			System.out.println("3--->InsertionSort to sort NAME");
			System.out.println("4--->To Exit or to continue");
			int ch=scan.nextInt();
			switch(ch)
			{
			case 1:sss.studentBubbleSort(arr);
			break;
			
			case 2:sss.studentInsertionSort(arr);
			break;
			
			case 3:sss.studentSelectionSort(arr);
			break;
			
			case 4:System.out.println("Enter true to continue false to exit");
			opt=scan.nextBoolean();
			}
		}
		
		System.out.println("Enter ONLY ID to be searched using binary search");
		int id=scan.nextInt();
		for(int i=0;i<=arr.length-2;i++)
		{
			boolean bSearch=sss.studentBinarySearch(arr,id);
			if(bSearch==true)
			{
				System.out.println("Id "+id+" found");
			}
			else
			{
				System.out.println("Id not found");
			}
		}
		
	}

}
