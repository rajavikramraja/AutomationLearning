package org.javaInterview;

import java.util.Scanner;

public class ReverseStringLoop {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	
	String nextLine = sc.nextLine();
	
	String reverseValue="";
	//For reverse need to iterate from last
	for(int i=nextLine.length()-1; i>=0;i--) {
		//empty string + chartAt -- ""+m=m
			reverseValue=reverseValue+nextLine.charAt(i);	
	}
	System.out.println("Reverse String "+ reverseValue );
}
}
