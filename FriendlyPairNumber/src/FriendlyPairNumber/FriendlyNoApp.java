package FriendlyPairNumber;
import java.util.*;
public class FriendlyNoApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a two numbers to check for Friendly pair number");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		FriendlyNo fn= new FriendlyNo();
		
		int sum1=fn.friendlyPair(num1);
		int sum2=fn.friendlyPair(num2);
		
		if(sum1/num1==sum2/num2)
		{
			System.out.println("The given pair of numbers are friendly pair");
		}
		else
		{
			System.out.println("The given pair of numbers are not friendly pair");
		}
		
	}

}
