
public class DigitSum {
	public int sumOfNos(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			sum+=rem;
			n=n/10;
		}
		
		return sum;
	}

}
