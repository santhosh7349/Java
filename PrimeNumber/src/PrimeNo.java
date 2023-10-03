import java.util.*;
public class PrimeNo {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the Number to check whether it is prime or not");
		int n=scan.nextInt();
		scan.close();

		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println("number "+n+" is not prime");
				return;
			}
		}
		System.out.println("Entered number is "+n+" is prime");
		
	}

}
