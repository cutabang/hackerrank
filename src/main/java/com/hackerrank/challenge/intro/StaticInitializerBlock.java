package com.hackerrank.challenge.intro;

import java.util.Scanner;

public class StaticInitializerBlock {
    private static final int b;
    private static final int h;
	
	static {
		Scanner sc=new Scanner(System.in);
		
		b = sc.nextInt();
		h = sc.nextInt();

		if (b>0 && h>0) {
			System.out.println(b*h);
		} else {
			try {
				throw new Exception("Breadth and height must be positive");
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
	public static void main(String[] args){}

}
