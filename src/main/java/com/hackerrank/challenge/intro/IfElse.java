package com.hackerrank.challenge.intro;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();            
        String ans="";
        if(n%2==1){
          ans = "Weird";
        }
        else{
            if (n>20) {
            	ans="Not Weird";
            } else if (n>5) {
            	ans="Weird";
            } else if (n>1) {
            	ans="Not Weird";
            }
           
            
        }
        System.out.println(ans);
        
    }
}
