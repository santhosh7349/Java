package ArrayPrograms.bin;
import java.util.Scanner;

public class ArrayUserInput
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter no of classes");
		int arr[][]=new int[scan.nextInt()][];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			
				System.out.println("Enter the no of students in class "+i);
				arr[i]=new int[scan.nextInt()];
			
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the age for students of class "+i);
				arr[i][j]=scan.nextInt();
			}
			
		}
		System.out.println("Array Contents Are....");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
        scan.close();
	}
}
