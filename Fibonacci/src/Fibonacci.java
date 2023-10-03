import java.util.*;
public class Fibonacci
{
	public static void fibonacci(int n)
	{
		int fib1=0;
		int fib2=1;
		
		if(n==1)
		{
			System.out.println(fib1 +" ");
		}
		else if(n==2)
		{
			System.out.println(fib2+" ");
		}
		else
		{			
			System.out.println(fib1 +" ");
			System.out.println(fib2 +" ");
			
			for(int i=3;i<=n;i++)
			{
				int nextNo=fib1+fib2;
				System.out.println(nextNo+" ");
				fib1=fib2;
				fib2=nextNo;
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter n");
		int n=scan.nextInt();
		fibonacci(n);
		scan.close();
	}
}
