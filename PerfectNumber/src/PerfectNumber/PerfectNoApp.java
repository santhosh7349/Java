package PerfectNumber;
import java.util.*;
public class PerfectNoApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a number to check for Perfect number");
		int n=scan.nextInt();
		scan.close();
		
		PerfectNo pn=new PerfectNo();
		int result=pn.perfectDetect(n);
		
		if(result==n)
		{
			System.out.println("Given number is perfect number");
		}
		else
		{
			System.out.println("Given number is not perfect number");
		}
	}

}
