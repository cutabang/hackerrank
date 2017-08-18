package com.hackerrank.challenge.mitrais;

public class Test {
    public static void main(String[] args) {
    	int[] a = {1};
    	Test t = new Test();
    	t.increment(a);
    	System.out.println(a[a.length-1]);
    	
    	t.add(5);
    }
    
    void increment(int[] i) {
    	i[i.length-1]++;
    }
    
    void add(int a) {
    	loop: for (int i=1;i<3;i++) {
    		for (int j=1;j<3;j++) {
    			if(a==5) {
    				break loop;
    			}
    			System.out.println(i*j);
    		}
    	}
    }
}
