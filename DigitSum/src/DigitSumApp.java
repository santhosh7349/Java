import java.util.*;
public class DigitSumApp {
	public static void main(String[] args) {
		DigitSum ds=new DigitSum();
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the number to sum it");
		int n=scan.nextInt();
		
		int result=ds.sumOfNos(n);
		System.out.println("Sum of given number "+n+" is "+result);
	}

}
