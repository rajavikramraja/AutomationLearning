package org.javaInterview;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number");
		int ni = sc.nextInt();
		System.out.println("You Enter Value "+ni);
		int reverse=0;
		int original=0;
		while(ni>0)
			//123>0
		{
			original=ni%10;
			//123%10=3
			reverse=reverse*10+original;
			//0+3
			ni=ni/10;
			//123/10=12
		}
		System.out.println(reverse);
	}

}
