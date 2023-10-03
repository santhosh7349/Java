import java.util.*;
public class ReverseApp {
	public static void main(String[] args)
	{
		ReverseNum rn=new ReverseNum();
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the number to reverse it and to find for palindrome");
		int n=scan.nextInt();
		scan.close();
		
		int result=rn.reverse(n);
		System.out.println("The reverse of the given number "+n+" is "+result);
		
		//to check for Palindrome
		if(n==result)
		{
			System.out.println("Given number "+n+" is palindrome");
		}
		else
		{
			System.out.println("Given number "+n+" is not palindrome");
		}
		
	}
		

}
