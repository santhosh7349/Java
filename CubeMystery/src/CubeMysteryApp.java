import java.util.*;
public class CubeMysteryApp {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=scan.nextInt();
		
		int cube=CubeMystery.cubeNo(a);
		System.out.println("cube result:"+cube);
		scan.close();
	}
}
