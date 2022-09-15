package com.test;

public class MissingNaturalNumber {
	public static void main(String[] args) {
		
		int arr[]=new int[] {1,2,3,4,5,6,7,8,9,11,12,13,14};
		
		int sum=(14*15)/2;
		
		int accutalsum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			accutalsum=accutalsum+arr[i];
		}
		 
		System.out.println("Missing Number is: "+(sum-accutalsum));
	}

}
