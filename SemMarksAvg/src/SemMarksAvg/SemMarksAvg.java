package SemMarksAvg;
import java.util.*;
public class SemMarksAvg {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the marks of all the semester");
		int sem1=scan.nextInt();
		int sem2=scan.nextInt();
		int sem3=scan.nextInt();
		int sem4=scan.nextInt();
		int sem5=scan.nextInt();
		int sem6=scan.nextInt();
		int sem7=scan.nextInt();
		int sem8=scan.nextInt();
		double average=avgCal(sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8);
		System.out.printf("The average marks:%.2f",average);
		scan.close();
	}
	
	public static double avgCal(int a,int b,int c,int d,int e,int f,int g,int h)
	{
		return (a+b+c+d+e+f+g+h)/8;
	}

}
