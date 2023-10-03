import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number above 100 for n till where you want nos to get printed");
		int n=scan.nextInt();
		from1ToN(n);
		scan.close();
	}
	public static void from1ToN(int n)
	{	
			if(n>100)
			{
				System.out.println("The nos from 1 to N are:");
				for(int i=1;i<=n;i++)
				{

					System.out.println(i);

				}
			}
			else
			{
				System.out.println("\'n\' must above 100");
			}
	}
}
