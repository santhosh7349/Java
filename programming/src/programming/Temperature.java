package programming;
import java.util.*;
public class Temperature {
	static void convert(int a)
	{
		int fh=(a*(9/5))+32;
		System.out.println("Temperature in fahreneit:"+fh);
	}
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the Temperture in degree celsius");
		int temp=scan.nextInt();
		
		convert(temp);
		
		scan.close();
		
	}
}
