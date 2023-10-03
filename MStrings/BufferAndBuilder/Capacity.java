package com.kodnest.MStrings.BufferAndBuilder;

public class Capacity {
	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer();
		System.out.println(sb1.capacity());
		sb1.append("Sachin is a batsman");
		System.out.println(sb1.capacity());
		sb1.append("He lives in mumbai");
		System.out.println(sb1.capacity());
		
		StringBuilder strb=new StringBuilder();
		System.out.println(strb.capacity());
		strb.append("Sachin is a batsman");
		System.out.println(strb.capacity());
		strb.append("He lives in mumbai");
		System.out.println(strb.capacity());
	}

}
