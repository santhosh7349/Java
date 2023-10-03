import java.util.*;
public class Main {
	public static void getProduct(String Product)
	{
		
			
			switch(Product)
			{
				case "p01":System.out.println("COCA COLA");
				break;
				case "p02":System.out.println("THUMPS UP");
				break;
				case "p03":System.out.println("MOUNTAIN DUE");
				break;
				default:System.out.println("Wrong input");
			}		
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the ProductCode");
		String a=scan.next();
		getProduct(a);
		scan.close();
	}

}
