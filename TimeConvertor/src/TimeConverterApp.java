import java.util.*;
public class TimeConverterApp {
	public static void main(String[]args)
	{	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the time in minutes");
		int min=scan.nextInt();
		
		TimeConverter tc=new TimeConverter();
		double result=tc.convert(min);
		
		System.out.println("The converted time in hour format:"+result);
		scan.close();
	}

}
