package com.kodnest.NonPrimitiveDataType.Arrays;

public class StudentSearchSort 
{
	static void studentArrayPrint(Student arr[])
	{
		System.out.println("The details of students are:");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i].id+" "+arr[i].name+" "+arr[i].marks);
		}
	}
	
	public boolean studentSearchElement(Student arr[],String name)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i].name.equals(name))
			{
				System.out.println();
				return true;
			}
		}
		System.out.println();
		return false;
	}
	
	public void studentBubbleSort(Student arr[])
	{
		for(int i=0;i<=arr.length-2;i++)
		{
			for(int j=0;j<=arr.length-2-i;j++)
			{
				if(arr[j].id>arr[j+1].id)
				{
					Student temp;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	public void studentSelectionSort(Student[] arr)
	{
		int min;
		int posi;
		for(int i=0;i<=arr.length-2;i++)
		{
			min=arr[i].marks;
			posi=i;
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[j].marks<min)
				{
					min=arr[j].marks;
					posi=j;
				}
			}
			Student temp;
			temp=arr[i];
			arr[i]=arr[posi];
			arr[posi]=temp;
			
		}
	}
	
	public void studentInsertionSort(Student arr[])
	{
		for(int i=1;i<=arr.length-1;i++)
		{
			String item=arr[i].name;
			int j=i-1;
			while(j<=0 && arr[j].name.compareTo(item)>0)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1].name=item;
		}
	}
	
	public boolean studentBinarySearch(Student arr[],int key)
	{
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid].id==key)
			{
				return true;
			}
			else if(key>arr[mid].id)
			{
				low=mid+1;
				high=high;
			}
			else
			{
				high=mid-1;
				low=low;
				
			}
		}
		return false;
	}

}
