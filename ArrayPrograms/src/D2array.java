import java.util.Scanner;

public class D2array
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int arr[][]=new int[2][5];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the marks of class "+i+" student "+j);
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
		}
        scan.close();
	}
}
