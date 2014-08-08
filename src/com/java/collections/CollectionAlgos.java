package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionAlgos {

    public static void main(String[] args) {

	List<Integer> list = new ArrayList<Integer>();
	for (int i = 0; i < 100; i++) {
	    list.add((int) (Math.random() * 100));
	}
	
	Collections.sort(list);
	System.out.println("Sorted Collections: " + list);
	
	int testNumber = 1;
	int index = Collections.binarySearch(list, testNumber);
	if (index > 0) {
	    System.out.println("Test Number: " + testNumber + " was found at index: " + index);
	} else {
	    System.out.println("Index not found.");
	}
	
	System.out.println("Maximum: " + Collections.max(list));
	System.out.println("Minimum: " + Collections.min(list));
	System.out.println("Occurence of 1: " + Collections.frequency(list, testNumber));
	
	Set<Integer> sortedList = new HashSet<Integer>();
	sortedList.addAll(list);
	System.out.println("Number of distinct elements: " + sortedList.size());

    }

}
