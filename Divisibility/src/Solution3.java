import java.util.Scanner;
public class Solution3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number for n to check for divisible by 3");
		int n=scan.nextInt();
		divisibleBy3(n);
		scan.close();
	}
	public static void divisibleBy3(int n)
	{
		System.out.println("The nos divisible by 3 are");
		for(int i=1;i<=n;i++)
		{
			if(i%3==0)
			{
				System.out.println(i);
			}
		}
	}
}
