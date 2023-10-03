package com.kodnest.Strings.ReversetheWords;

public class ReverseOnlyWords {
	String reverse(String s1)
	{
		String[] words=s1.split(" ");
		String revWords=null;
		String revString="";
		
		for(int i=0;i<=words.length-1;i++)
		{
			String w=words[i];
			
			char[] ch=w.toCharArray();
			char[] rw=new char[ch.length];
			
			int j=rw.length-1;
			for(int k=0;k<=ch.length-1;k++)
			{
				rw[j]=ch[k];
				j--;
			}
			
			revWords=new String(rw);
			revString=revString+revWords+" ";
		}
		return revString;
	}

}
