import java.util.Scanner;
public class Factorial {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The N");
		int n=scan.nextInt();
		int fact=1;
		scan.close();
		
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("The Factorial is:"+fact);
	}

}
