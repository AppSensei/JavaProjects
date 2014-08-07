package com.java.sortedset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class DistinctWordSet {

    public static void main(String[] args) {

	int count = 0;
	Set<String> words = new HashSet<String>();

	System.out.println("What is your name? : ");
	Scanner input = new Scanner(System.in);
	String str;
	while (!(str = input.nextLine()).equals("")) {
	    count++;
	    words.add(str);
	}

	System.out.println("......");
	System.out.println("Total number of words: " + count);
	System.out.println("Distinct Words: " + words.size());
	System.out.println("......");

	Iterator<String> it = words.iterator();
	while (it.hasNext()) {
	    System.out.println(it.next());
	}
    }

}
