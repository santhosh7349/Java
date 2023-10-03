import java.util.*;
public class Main {
	public static void identifyPolygon(int sides)
	{
		if(sides>0)
		{
			
			switch(sides)
			{
			case 2:System.out.println("The given polygon is LINE");
			break;
			case 3:System.out.println("The given polygon is TRIANGLE");
			break;
			case 4:System.out.println("The given polygon is QUADRALATERAL");
			break;
			case 5:System.out.println("The given polygon is PENTAGON");
			break;
			case 6:System.out.println("The given polygon is HEXAGON");
			break;
			case 7:System.out.println("The given polygon is HEPTAGON");
			break;
			case 8:System.out.println("The given polygon is OCTAGON");
			break;
			case 9:System.out.println("The given polygon is NANOGON");
			break;
			case 10:System.out.println("The given polygon is DECAGON");
			break;
			default:System.out.println("Enter the sides between 2 to 10");

			}

		}
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sides of polygon");
		int s=scan.nextInt();
		identifyPolygon(s);
		scan.close();
	}

}
