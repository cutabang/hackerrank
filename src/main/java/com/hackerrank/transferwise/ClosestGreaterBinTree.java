package com.hackerrank.transferwise;

import java.util.Scanner;

public class ClosestGreaterBinTree {

	private static class Node {
		Node left, right, parent;
		int data;

		Node(int newData) {
			left = right = parent = null;
			data = newData;
		}
	}

	private static int nextIntegerGreaterThan(Node root, int val){
		Node closestNode = root;
		Node node = root;

		while (node != null) {
			if (node.data == val) {
				return closestNode.data;
			}
			
			if (Math.abs(val - node.data) < Math.abs(val - closestNode.data)) {
				closestNode = node;
			}
			
			if (node.data > val) {
				node = node.left;
			} else {
				node = node.right;
			}
		}
		
		return closestNode.data;
	}
	
	private static Node insert(Node node, int data) {
		if (node==null) {
			node = new Node(data);
		}
		else {
			if (data <= node.data) {
				node.left = insert(node.left, data);
                node.left.parent = node;
			}
			else {
				node.right = insert(node.right, data);
                node.right.parent = node;
			}
		}
		return(node);
	}

	public static void main(String [] args) throws Exception{ 
		Scanner in = new Scanner(System.in);
		Node _root;
		int root_i=0, root_cnt = 0, root_num = 0;
		root_cnt = in.nextInt();
        _root=null;
        for(root_i = 0; root_i < root_cnt; root_i++){
            root_num = in.nextInt();
            if( root_i == 0)
                _root = new Node(root_num);
            else           
                insert(_root, root_num);
        }
		
		int _x = in.nextInt();
		System.out.println(nextIntegerGreaterThan(_root,_x));
		return;
	}
	
    

}
