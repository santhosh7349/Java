package DoubleTheNo;
import java.util.*;
public class DoubleTheNo {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int result=DoubleTheNo(num);
		System.out.println(result);
	}
	public static int DoubleTheNo(int num)
	{
		return num*2;
	}

}
