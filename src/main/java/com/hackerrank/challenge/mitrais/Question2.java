package com.hackerrank.challenge.mitrais;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNextLine()) {
			int n = sc.nextInt();
			int p = sc.nextInt();
			MyCalculator calc = new MyCalculator();
			try {
				System.out.println(calc.power(n, p));
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}

	}
}

class MyCalculator {
    int power(int n, int p) throws Exception {
    	if (n<0 || p<0) {
    		throw new Exception("n and p should be non negative");
    	}
    	
    	return p==0 ? 1 : n*power(n,p-1);
    }
}