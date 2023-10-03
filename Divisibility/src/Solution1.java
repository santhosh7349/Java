import java.util.*;
public class Solution1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the range of nos to check for Prime");
		int n=scan.nextInt();
		int count=0;
		scan.close();
		for(int i=3;i<=n;i++)
		{
			int result=checkPrime(i);
			if(result!=0)
			{
				System.out.println("The prime nos are:"+result);
				count++;
			}
		}
		System.out.println("The number of Prime Numbers are:"+count);
	}
	public static int checkPrime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return 0;
			}
		}
		return n;
	}

}
