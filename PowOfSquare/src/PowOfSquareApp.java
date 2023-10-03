import java.util.*;
public class PowOfSquareApp {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=scan.nextInt();
		
		int square=PowOfsquare.powersq(a);
		System.out.println("power of Square:"+square);
	}

}
