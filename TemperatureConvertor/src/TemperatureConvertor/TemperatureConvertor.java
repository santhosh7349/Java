package TemperatureConvertor;
import java.util.*;
public class TemperatureConvertor {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the Temperature in faherient");
		float temp=scan.nextFloat();
		
		float tempf=tempConvert(temp);
		System.out.printf("Temperature in celsius:%.2f",tempf);
		scan.close();
	}
	static float tempConvert(float temp)
	{
		return (temp - 32) * 5/9;
	}

}
