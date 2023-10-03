import java.util.*;
public class HalfItApp {
	public static void main(String[]args)
	{
		HalveIt hi=new HalveIt();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		double num=scan.nextDouble();
		
		double result=hi.halfIt(num);
		System.out.println("Half Amount is:"+result);
		scan.close();
				
	}

}
