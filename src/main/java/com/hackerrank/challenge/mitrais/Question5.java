package com.hackerrank.challenge.mitrais;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

abstract class Arithmatic {
	abstract int add(int a, int b);
}

class Adder extends Arithmatic {

	@Override
	int add(int a, int b) {
		return a+b;
	}
	
}