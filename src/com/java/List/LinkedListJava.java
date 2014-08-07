package com.java.List;

import java.util.LinkedList;
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




    }
}
