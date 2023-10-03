import java.util.*;
public class AreaOfSphereApp {
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the radius of sphere");
		double r=scan.nextDouble();
		
		AreaOfSphere aos=new AreaOfSphere();
		double result=aos.Area(r);
		
		System.out.printf("Area of Sphere:%.3f",result);
		scan.close();
	}

}
