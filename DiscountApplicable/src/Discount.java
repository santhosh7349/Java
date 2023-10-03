import java.util.*;
public class Discount {
	public static void checkDiscount(double purchaseAmount)
	{
		if(purchaseAmount>100)
		{
			System.out.println("Discount Applicable");
		}
		else
		{
			System.out.println("Discount not applicable");
		}
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the amount");
		double amt=scan.nextDouble();
		checkDiscount(amt);

	}

}
