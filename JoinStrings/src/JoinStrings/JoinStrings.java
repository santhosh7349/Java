package JoinStrings;
import java.util.*;
public class JoinStrings {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		String name1=scan.next();
		String name2=scan.next();
		String result=joinString(name1,name2);
		System.out.println(result);
		scan.close();
	}
	public static String joinString(String name1,String name2)
	{
		return name1+name2;
	}
	

}
