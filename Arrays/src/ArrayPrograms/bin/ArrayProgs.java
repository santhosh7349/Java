package ArrayPrograms.bin;
import java.util.*;
public class ArrayProgs {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array elements");
		int a[]=new int[5];
		
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("The array elements are...");
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]+" ");
		}
		scan.close();
	}

}
