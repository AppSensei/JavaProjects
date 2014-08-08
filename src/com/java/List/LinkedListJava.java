package com.java.List;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListJava {

    public static void main(String[] args) {

	LinkedList<String> newStudents = new LinkedList<String>();

	for (int i = 0; i <= 10; i++) {

	    System.out.println("What is your name?");
	    Scanner input = new Scanner(System.in);
	    String newName = input.nextLine();

	    newStudents.add(newName);
	    System.out.println(newStudents);

	}

	// Using ListIterator().
	// It is different from iterator because this can add elements.

	ListIterator<String> it = newStudents.listIterator();
	it.add("Mariam John");
	it.add("Elza John");
	it.add("Jasmine John");
	it.add("Priya John");

	while (it.hasNext()) {
	    String string = (String) it.next();
	    System.out.println(string);
	}

    }
}
