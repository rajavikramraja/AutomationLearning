package org.javaInterview;

import java.util.Scanner;

public class ReverseStringBuilder {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String nl = sc.nextLine();
	StringBuilder sb =new StringBuilder(nl);
	
	System.out.println("The reverse String "+sb.reverse());
}
}
