package org.javaInterview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateWord {
	public static void main(String[] args) {
		String ar[]= {"Kanna","Rajan","Raja","raja","Rajan"};
		Set<String> duplicateFind=new TreeSet<>();
		for (String string : ar) {
			 duplicateFind.add(string);
		}
		System.out.println(duplicateFind);
	}

}
