package HarshadNo;
import java.util.*;
public class HarshadNoApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	
		System.out.println("Enter a number to check for Harshad number");
		int n=scan.nextInt();
		scan.close();
		
		int sum=HarshadNo.harshadDetect(n);
		
		if(n%sum==0)
		{
			System.out.println("Given number is Harshad number");
		}
		else
		{
			System.out.println("Given number is not Harshad number");
		}
	}
}
