package com.hackerrank.challenge.mitrais;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question1 {

	public static void main(String[] args) {
		/*Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			String iP = in.next();
            MyRegex mr = new MyRegex(iP);
			System.out.println(mr.isMatch());
		}
        in.close();*/
		
		divide(4,0);

	}
	
	public static int divide(int a, int b) {
		int c=-1;
		
		try {
			c=a/b;
		} catch (Exception e) {
			System.out.println("exception");
		} finally {
			System.out.println("finaly");
		}
		
		return c;
	}

}

class MyRegex extends Question1 {
    private static String pattern = "\\b((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.|$)){4}\\b";
    private String ip;
    
    public MyRegex(String iP) { 
        this.ip=iP;
    }
    
    public boolean isMatch() {
        Pattern patterns = Pattern.compile(pattern); 
        Matcher matcher = patterns.matcher(ip);
        
        return matcher.matches();
    }
}