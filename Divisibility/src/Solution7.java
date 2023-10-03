import java.util.Scanner;
public class Solution7 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number for n to check for EVEN nos divisible by 3");
		int n=scan.nextInt();
		evenDivisibleBy2(n);
		scan.close();
	}
	public static void evenDivisibleBy2(int n)
	{
		System.out.println("The Even nos divisible by 3 are");
		for(int i=1;i<=n;i++)
		{
			if(i%2==0 && i%3==0)
			{
				System.out.println(i);
			}
		}
	}
}
