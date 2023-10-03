import java.util.Scanner;
public class Solution6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number for n to check for divisible by 3 and 5");
		int n=scan.nextInt();
		divisibleBy3and5(n);
		scan.close();
	}
	public static void divisibleBy3and5(int n)
	{
		System.out.println("The nos divisible by 3 and 5 are");
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println(i);
			}
		}
	}
}
