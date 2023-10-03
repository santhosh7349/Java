import java.util.*;
public class HeghtConvert {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the Height of the player in inches");
		double inches=scan.nextDouble();
		
		double result=HeightConvertApp.convert(inches);
		System.out.println("The Converted Height in feet:"+result);
		scan.close();
	}

}
