package StrongNumber;

public class StrongNo {
	static int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	static int strongDetect(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+factorial(rem);
			n=n/10;		
		}
		return sum;
	}

}
