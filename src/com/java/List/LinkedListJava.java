package com.java.List;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class LinkedListJava {

    public static void main(String[] args) {

	LinkedList<String> newStudents = new LinkedList<String>();

	for (int i = 0; i < args.length; i++) {

	    Scanner input = new Scanner(System.in);
	    System.out.println("What is your name?");
	    String newName = input.nextLine();

	    newStudents.add(newName);
	    i++;
		System.out.println("Display all the students: " + newStudents.size());

	}
	

    }

}