package AbundantNumber;
import java.util.*;
public class AbundantNoApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a number to check for Abundant number");
		int n=scan.nextInt();
		scan.close();
		
		AbundantNo an=new AbundantNo();
		int sum=an.abundantDetect(n);
		
		if(sum>n)
		{
			System.out.println("Given number is Abundant number");
		}
		else
		{
			System.out.println("Given number is not Abundant number");
		}
		
		
	}

}
