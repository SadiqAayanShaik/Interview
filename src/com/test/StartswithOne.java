package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StartswithOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[] {1,2,3,4,9,13,14,100};
		
		List<Integer>list=Arrays.asList(1,2,3,4,13,14,10,100);
		list.stream().map(s->""+s).filter(s->s.startsWith("1")).forEach(System.out::println);
	}

}
