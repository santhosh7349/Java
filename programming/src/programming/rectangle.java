package programming;
import java.util.Scanner;
public class rectangle {
	static int area(int l,int b)
	{
		return l*b;
	}
	public static void main(String[]args)
	{
		System.out.println("Enter the length and breadth of rectangle"); 
		Scanner scan= new Scanner(System.in);
		int l=scan.nextInt();
		int b=scan.nextInt();
		
		int result=area(l,b);
		System.out.println("result of rectangle\n"+result);		
	}

}
