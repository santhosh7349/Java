import java.util.Scanner;
public class Solution4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number for n to check for divisible by 5");
		int n=scan.nextInt();
		divisibleBy5(n);
		scan.close();
	}
	public static void divisibleBy5(int n)
	{
		System.out.println("The nos divisible by 5 are");
		for(int i=1;i<=n;i++)
		{
			if(i%5==0)
			{
				System.out.println(i);
			}
		}
	}
}
