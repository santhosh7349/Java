import java.util.Scanner;

public class D2array2
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Rows and Columns where rows is for game colums is for players");
		float arr[][]=new float[scan.nextInt()][scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the height in game "+i+" player "+j);
				arr[i][j]=scan.nextFloat();
			}
		}
		System.out.println("Array Contents Are....");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
        scan.close();
	}
}
