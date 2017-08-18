package com.hackerrank.sampletest;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Question1 {

	public static void main(String[] args) {
		System.out.println("test1: " + test(new int[]{1,2},2));
		System.out.println("test2: " + test(new int[]{},2));
		System.out.println("test1: " + test(null,2));
	}
	
	public static String test(int[] arr, int k) {
		if (arr==null) return "NO";
		
		IntStream intStream = Arrays.stream(arr);
		
		return intStream.anyMatch(x->x==k) ? "YES" : "NO";
	}

}
