import java.util.Scanner;
public class Solution8 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number for n to check for ODD nos divisible by 5");
		int n=scan.nextInt();
		oddDivisibleBy5(n);
		scan.close();
	}
	public static void oddDivisibleBy5(int n)
	{
		System.out.println("The ODD nos divisible by 5 are");
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0 && i%5==0)
			{
				System.out.println(i);
			}
		}
	}
}
