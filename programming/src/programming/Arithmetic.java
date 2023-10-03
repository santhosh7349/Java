package programming;
import java.util.*;
public class Arithmetic {
	public static void main(String[]args)
	{
		System.out.println("Enter two values to perform arithmetic operations");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		ArithmeticMethods ar=new ArithmeticMethods();
		
		int addresult=ar.add(a, b);
		System.out.println("Addition result:"+addresult);
		
		int subresult=ar.sub(b,a);
		System.out.println("Substraction result:"+subresult);
		
		int mulresult=ar.mul(a, b);
		System.out.println("Multiplication result:"+mulresult);
		
		int divresult=ar.div(b, a);
		System.out.println("Division result:"+divresult);
		
		int remresult=ar.rem(b, a);
		System.out.println("Remainder result:"+remresult);
	}
}
