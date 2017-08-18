package com.hackerrank.challenge.data_structure;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.*;

public class Dequeue {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] intArray = new int[n];

        for (int i = 0; i < n; i++) {
            intArray[i] = in.nextInt();
        }
        in.close();
        
        System.out.println("result: " + solution2(intArray,m)); //solution2 is faster
        
	}
	
	public static int solution1(int[] A, int k) {
		for (int i=0;i<A.length;i++) {
			System.out.print(A[i]+" ");
		}
		System.out.println("\n");
		
		Deque<Integer> deque = new ArrayDeque<>();
		int result=0;
		
		for (int i=0; i<A.length-k+1; i++) {
			Set<Integer> set = new HashSet<>(); 
			
			for (int j=i;j<k+i;j++) {
				set.add(A[j]);
				
				if (set.size()>result) {
					result = set.size();
				}
			}
			
			System.out.println("set " + i +": " + set);
		}
		
		return result;
	}
	
	public static int solution2(int[] A, int k) {
		for (int i=0;i<A.length;i++) {
			System.out.print(A[i]+" ");
		}
		System.out.println("\n");
		
		Deque<Integer> deck = new ArrayDeque<>();
		Set<Integer> set = new HashSet<>();
		int result=1;
		
		for (int i=0; i<A.length; i++) {
			set.add(A[i]);
			deck.add(A[i]);
			
			if (deck.size()==k+1) {
				int removedElement = deck.remove();
				
				if (!deck.contains(removedElement)) {
					set.remove(removedElement);
				}
			}
			
			result = Math.max(set.size(), result);
		}
		
		return result;
	}
}
