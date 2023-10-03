import java.util.*;
public class SecretMsgDecApp {
	public static void main(String[]args)
	{	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the character");
		char a=scan.next().charAt(0);
		
		SecretMsgDec smd=new SecretMsgDec();
		int decodeResult=smd.decode(a);
		
		System.out.println("the decoded message:"+decodeResult);
		scan.close();
	}

}
