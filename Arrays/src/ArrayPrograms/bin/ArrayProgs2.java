package ArrayPrograms.bin;
import java.util.*;
public class ArrayProgs2 {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		String arr[]=new String[5];
		System.out.println("Enter the players name are..");
		for(int i=0; i<=arr.length-1; i++)
		{
			arr[i]=scan.next();
		}
		System.out.println("The players are...");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]+" ");
		}
		scan.close();
	}

}
