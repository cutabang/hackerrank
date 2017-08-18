package com.hackerrank.transferwise;

import java.util.Scanner;

/**
 * source: http://www.geeksforgeeks.org/longest-monotonically-increasing-subsequence-size-n-log-n/
 * @author khomeini
 *
 */
public class Subsequence {
	
	static int findLIS(int[] s) {
		int result=1; 
        int[] tailTable   = new int[s.length];
         
        tailTable[0] = s[0];
        
        for (int i=1; i < s.length; i++) {
            if (s[i] < tailTable[0]) {
                tailTable[0] = s[i];
            } else if (s[i] > tailTable[result-1]) {
                tailTable[result++] = s[i];
            } else {
                tailTable[calculateCeilIdx(tailTable, -1, result-1, s[i])] = s[i];
            }
        }
 
        return result;

    }
	
	static int calculateCeilIdx(int arr[], int i, int j, int key) {
        while (j-i > 1) {
            int m = i + (j-i)/2;
            
            if (arr[m] >= key) {
                j = m;
            } else {
                i = m;
            }
        }
 
        return j;
    }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int res;
        
        int _s_size = Integer.parseInt(in.nextLine());
        int[] _s = new int[_s_size];
        int _s_item;
        for(int _s_i = 0; _s_i < _s_size; _s_i++) {
            _s_item = Integer.parseInt(in.nextLine());
            _s[_s_i] = _s_item;
        }
        
        res = findLIS(_s);
        System.out.println(res);
	}

}
