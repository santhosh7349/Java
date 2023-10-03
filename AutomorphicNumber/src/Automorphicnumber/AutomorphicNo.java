package Automorphicnumber;

public class AutomorphicNo {
	static boolean autoMorphic(int n)
	{
		int sq=n*n;
		
		while(n!=0)
		{
			if(n%10!=sq%10)
			{
				return false;
			}
			n=n/10;
			sq=sq/10;
		}
		
		return true;
	}

}
