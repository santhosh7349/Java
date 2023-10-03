import java.util.Scanner;
public class Solution5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number for n to check for divisible by 2 and 5");
		int n=scan.nextInt();
		divisibleBy2and5(n);
		scan.close();
	}
	public static void divisibleBy2and5(int n)
	{
		System.out.println("The nos divisible by 2 and 5 are");
		for(int i=1;i<=n;i++)
		{
			if(i%2==0 && i%5==0)
			{
				System.out.println(i);
			}
		}
	}
}
