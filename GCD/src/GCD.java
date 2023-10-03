import java.util.*;
public class GCD {
	int findGCD(int m,int n)
	{
		while(n!=0)
		{
			int rem=m%n;
			m=n;
			n=rem;
		}
		int gcd=m;
		return gcd;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		GCD gcd=new GCD();
		System.out.println("Enter two nos to find GCD of them");
		int m=scan.nextInt();
		int n=scan.nextInt();
		int res=gcd.findGCD(m,n);
		System.out.println("GCD of "+m+" and "+n+" is "+res);
		scan.close();
	}

}
