package com.test;

public class Test {
	public static void main(String[] args) {

		String s1="Abc";
		String s2="XYZ";
		
		String s3=new String("Abc");
		
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		System.out.println("s3: "+s3);
		
		System.out.println();
		
		s3=s2;
		s2=s1;
		
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		System.out.println("s3: "+s3);
		
		s3=s1+s2;
		System.out.println("\ns3=s1+s2: "+s3);
	}
}
