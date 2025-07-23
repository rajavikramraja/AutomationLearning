package org.javaInterview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateWord {
	public void duplicateArray() {
		String ar[]= {"Kanna","Rajan","Raja","raja","Rajan"};
		Set<String> duplicateFind=new TreeSet<>();
		for (String string : ar) {
			 duplicateFind.add(string);
		}
		System.out.println(duplicateFind);

	}
	public void DuplicateCount() {
		String dupval[]= {"Kannan","Rajan","Raja","raja","Rajan","Raja"};
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
		System.out.println(duplicateValue);
		}
		
	
	
	public static void main(String[] args) {
		DuplicateWord s= new DuplicateWord();
		s.duplicateArray();
		s.DuplicateCount();
			}

}
