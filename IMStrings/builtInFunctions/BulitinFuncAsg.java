package com.kodnest.IMStrings.builtInFunctions;

public class BulitinFuncAsg {
	public static void main(String[] args) {
		String name="Raja Ram Mohan Roy";
		
		System.out.println(name.length());
		System.out.println("***********************************");
		
		System.out.println(name.startsWith("Raj"));
		System.out.println("***********************************");
		
		System.out.println(name.endsWith("Roi"));
		System.out.println("***********************************");
		
		System.out.println(name.replace("Ram","Rav"));
		System.out.println("***********************************");
		
		name.replaceAll("a","i");
		System.out.println(name);
		System.out.println("***********************************");
		
		String str=new String("Ravana Brahma");
		char[] ch=str.toCharArray();
		for(char x:ch)
		{
			System.out.println(x+" ");
		}
		System.out.println("***********************************");
		
		String s1=new String("Omkar");
		String s2=s1.intern();
		String s3="Omkar";
		if(s2==s3)
		{
			System.out.println("Reference are equal");
		}
		else
		{
			System.out.println("Reference are unEqual");
		}
		System.out.println("***********************************");
		
		StringBuilder sb= new StringBuilder("Santhosh");
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println("************************************");
		
		System.out.println(name);//eventhough original string is not altered
	}

}
