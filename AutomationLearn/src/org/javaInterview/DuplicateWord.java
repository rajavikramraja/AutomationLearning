package org.javaInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateWord {
	String dupval[]= {"Kannan","Rajan","Raja","raja","Rajan","Raja","VikiV","Rajar","nannaK"};
	public void duplicateArray() {
		String ar[]= {"Kanna","Rajan","Raja","raja","Rajan"};
		Set<String> duplicateFind=new TreeSet<>();
		for (String string : ar) {
			 duplicateFind.add(string);
		}
		System.out.println(duplicateFind);

	}
	public void DuplicateCount() {
		String dupval[]= {"Kannan","Rajan","Raja","raja","Rajan","Raja","VikiV"};
		Map<String, Integer> duplicateValue=new LinkedHashMap<>();
//		duplicateValue.put("Kannan", 23);
//		duplicateValue.put("Rajan", 25);
//		duplicateValue.put("Raja", 23);
//		duplicateValue.put("raja", 25);
//		duplicateValue.put("Rajan", 26);
		for (String dup1 : dupval) {
			if (duplicateValue.containsKey(dup1)) {
				duplicateValue.put(dup1, duplicateValue.get(dup1)+1);
			} else {
duplicateValue.put(dup1, 1);
			}
			
		}
		System.out.println("Duplicate Value"+duplicateValue);
		}
		
	public void DuplicateChara() {
		System.out.println("Enter the Input");
		Scanner sc=new Scanner(System.in);
		String nl = sc.nextLine();
		Map<Character, Integer> dupchar=new LinkedHashMap<>();
	for (int i=0;nl.length()>i;i++) {
		char nll = nl.charAt(i);
		if(dupchar.containsKey(nll)) {
		dupchar.put(nll, dupchar.get(nll)+1);}
		else {
			dupchar.put(nl.charAt(i), 1);
			
		}
		
	}
	System.out.println(dupchar);
	}
	public void palindromestr() {
		
		for (String pal : dupval) {
			String rev="";
			for (int i = pal.length()-1; i>=0; i--) {
					
					rev=rev+ pal.charAt(i);
								
			}
			
		
		System.out.println("String"+rev);	
		if(Arrays.asList(pal).contains(rev)) {
		//if (pal.equalsIgnoreCase(rev)){
	System.out.println("Is Palindrome");
		}
		else {
			System.out.println("Is not Palindrome");
		}}
	}
	public static void main(String[] args) {
		DuplicateWord s= new DuplicateWord();
		s.duplicateArray();
		s.DuplicateCount();
		s.DuplicateChara();
		s.palindromestr();
			}

}
