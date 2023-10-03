package programming;
import java.util.*;
public class NoAsterisk {
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=scan.nextInt();
		
		int result1=a<<1;
		System.out.println("Result1:"+result1);
		
		int result2=a>>1;
		System.out.println("Result2:"+result2);
	}

}
