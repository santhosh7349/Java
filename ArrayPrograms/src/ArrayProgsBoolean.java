import java.util.Scanner;

public class ArrayProgsBoolean {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter People Count");
		boolean arr[]=new boolean[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Is Person "+i+" Married ? ");
			arr[i]=scan.nextBoolean();
		}
		System.out.println("Array Contents Are....");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Person "+i+" married "+arr[i]);

		}
        scan.close();
	}
}
