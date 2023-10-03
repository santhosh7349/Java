import java.util.*;
public class TenChecker {
	public static void checkMultipleOfTen(int n,int m)
	{
		if(n%m==0)
		{
			System.out.println("Given Number "+n+" is multiple of no "+m);
		}
		else
		{
			System.out.println("Given Number "+n+" is NOT multiple of no "+m);
		}
		
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number1");
		int num=scan.nextInt();
		System.out.println("Enter the number2");
		int num2=scan.nextInt();
		checkMultipleOfTen(num,num2);
	}

}
