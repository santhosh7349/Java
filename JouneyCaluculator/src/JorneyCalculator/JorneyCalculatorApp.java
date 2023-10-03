package JorneyCalculator;
import java.util.*;
public class JorneyCalculatorApp {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the speed and time");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		
		JourneyCalculator jc=new JourneyCalculator();
		double Distance=jc.calculateDistance(speed,time);
		
		System.out.printf("%.2f",Distance);
		scan.close();
	}

}
