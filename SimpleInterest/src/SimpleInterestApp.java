import java.util.*;
public class SimpleInterestApp {
	public static void main(String[]args)
	{	
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter the principle, Time, Rate of the amount");
		double p=scan.nextDouble();
		double t=scan.nextDouble();
		double r=scan.nextDouble();
		
		simpleInterest si=new simpleInterest();
		double result=si.interest(p, t, r);
		
		System.out.printf("Simple Inerest of the amount:%.2f",result);
		
		scan.close();
	}

}
