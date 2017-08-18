package com.hackerrank.transferwise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class KDifference {
	static int kDifference(int[] a, int k) {
		int result=0;
        Map<Integer, Integer> hashmap = new HashMap<>();
        
        for (int i=0;i<a.length;i++) {
        	hashmap.put(a[i], i);
        }
        
        for (int i=0;i<a.length;i++) {
        	if (hashmap.containsKey(a[i]+k)) {
        		result++;
        	}
        }
        
        return result;

    }

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int res;
        
        int _a_size = 0;
        _a_size = Integer.parseInt(in.nextLine().trim());
        int[] _a = new int[_a_size];
        int _a_item;
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(in.nextLine().trim());
            _a[_a_i] = _a_item;
        }
        
        int _k;
        _k = Integer.parseInt(in.nextLine().trim());
        
        res = kDifference(_a, _k);
        bw.write(String.valueOf(res));
        bw.newLine();
        
        bw.close();
	}

}
