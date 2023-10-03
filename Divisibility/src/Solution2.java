import java.util.Scanner;
public class Solution2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number for n to check for divisible by 2");
		int n=scan.nextInt();
		divisibleBy2(n);
		scan.close();
	}
	public static void divisibleBy2(int n)
	{
		System.out.println("The nos divisible by 2 are");
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
