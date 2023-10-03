import java.util.*;
public class main {
	public static void identifyCharacter(char ch)
	{
		if(Character.isDigit(ch))
		{
			System.out.println("Entered character is "+ch+" is digit");
		}
		else if(!Character.isLetter(ch))//also else if(Character.isLetter(ch)==false)
		{
			System.out.println("Entered character is "+ch+" is Special character");
		}
		else
		{
			switch(Character.toLowerCase(ch))
			{
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':	
					if(Character.isLowerCase(ch))
					{
						System.out.println("Entered charcter is "+ch+" LowerCasse Vowel");
					}
					else
					{
						System.out.println("Entered charcter is "+ch+" UpperCasse Vowel");
					}
					break;
				default:
					if(Character.isLowerCase(ch))
					{
						System.out.println("Entered charcter is "+ch+" LowerCasse Consonent");
					}
					else
					{
						System.out.println("Entered charcter is "+ch+" UpperCasse Consonent");
					}
			}
		}
	

	}
	public static void Main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch=scan.next().charAt(0);
		identifyCharacter(ch);
		scan.close();
	}

}
