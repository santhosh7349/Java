package ArrayPrograms.bin;
import java.util.*;
public class SearchAndSortApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter array length");
		int[] arr=new int[scan.nextInt()];
		
		System.out.println("Enter array elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Array elements before sorting:");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		
		
		SearchAndSort sns=new SearchAndSort();
		
		System.out.println();
		System.out.println("Enter 1----> Bubble sort");
		System.out.println("Enter 2----> Selection sort");
		System.out.println("Enter 3----> Insertion sort");
		int ch=scan.nextInt();
		
		switch(ch)
		{
			case 1:sns.bubble(arr);
				   System.out.println("Elements are sorted");
			break;
			
			case 2:sns.selection(arr);
			       System.out.println("Elements are sorted");
			break;
			
			case 3:sns.insertion(arr);
			       System.out.println("Elements are sorted");
			break;
			
			default:sns.bubble(arr);
			
		}
		System.out.println();
		System.out.println("Array elements after sorted");
		for(int y:arr)
		{
			System.out.println(y+" ");
		}
		System.out.println();
		
		System.out.println("Enter key to be searched");
		int key=scan.nextInt();
		
		int res1=sns.linear(arr, key);
		if(res1>=0)
		{
			System.out.println("key is found using linear search at position "+res1);
		}
		else
		{
			System.out.println("key is not found using linear search");
		}
		
		int res2=sns.binary(arr, key);
		if(res2>=0)
		{
			System.out.println("key is found using Binary search at position "+res2);
		}
		else
		{
			System.out.println("key is not found using Binary search");
		}
	}

}
