package com.hackerrank.challenge.data_structure;

import java.util.Scanner;

public class HashSetTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        
        java.util.HashSet<String> collection = new java.util.HashSet<>();
        
        for (int i = 0; i < t; i++) {
            collection.add(String.format("%s %s", pair_left[i], pair_right[i]));
            System.out.println(collection.size());
        }

	}

}
