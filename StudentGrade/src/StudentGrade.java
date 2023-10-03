import java.util.*;
public class StudentGrade {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the student marks");
		int marks=scan.nextInt();
		gradeCheck(marks);
		scan.close();
	}
	public static void gradeCheck(int marks)
	{
		if(marks>50)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}

}
