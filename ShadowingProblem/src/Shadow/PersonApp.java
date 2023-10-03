package Shadow;
import java.util.*;

public class PersonApp {
	
	public static void main(String []args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter id");
		int id=scan.nextInt();
		
		System.out.println("Enter name");
		scan.nextLine();
		String name=scan.nextLine();
		
		System.out.println("Enter gender");
		String gender=scan.nextLine();
		
		System.out.println("Enter Email");
		String email=scan.nextLine();
		
		System.out.println("Enter Phone number");
		long phone=scan.nextLong();
		
		Person p1=new Person(id,name,gender,email,phone);
		System.out.println(p1.id+" "+p1.name+" "+p1.gender+" "+p1.email+" "+p1.phone);
		
	}

}
