import java.util.*;
public class Swap {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		System.out.println("numbers before swapping");
		System.out.println(a+" "+b);
		
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("numbers After swapping");
		System.out.println(a+" "+b);
	}

}
