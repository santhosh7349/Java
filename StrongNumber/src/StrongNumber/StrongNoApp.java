package StrongNumber;
import java.util.*;
public class StrongNoApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a number to check for Strong number");
		int n=scan.nextInt();
		scan.close();
		
		int result=StrongNo.strongDetect(n);
		
		if(result==n)
		{
			System.out.println("GIven number is strong number");
		}
		else
		{
			System.out.println("GIven number is not strong number");
		}
	}

}
