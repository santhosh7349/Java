package Automorphicnumber;
import java.util.*;
public class AutomorphicNoApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a number to check for automorphic number");
		int n=scan.nextInt();
		scan.close();
		
		boolean result=AutomorphicNo.autoMorphic(n);
		
		if(result==true)
		{
			System.out.println("Given number is Automorphic Number");
		}
		else
		{
			System.out.println("Given number is Automorphic Number");
		}
	}

}
