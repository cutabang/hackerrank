package com.hackerrank.challenge.intro;

import java.util.Scanner;

public class EndOfFile {

	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		Scanner sc=new Scanner(System.in);
		int i=1;
		
		while(sc.hasNextLine()) {
			System.out.printf("%d %s",i,sc.nextLine());
			i++;
		}
	}

}
