import java.util.*;
public class SumOfNos {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The N");
		int n=scan.nextInt();
		int sum=0;
		scan.close();
		for(int i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("The Sum is:"+sum);
	}

}
