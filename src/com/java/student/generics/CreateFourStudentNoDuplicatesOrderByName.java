package com.java.student.generics;

import java.util.TreeSet;

public class CreateFourStudentNoDuplicatesOrderByName {

    public static void main(String[] args) {

	Student stud01 = new Student("Bill", "bill@rediffmail.com");
	Student stud02 = new Student("Obama", "obama@rediffmail.com");
	Student stud03 = new Student("Nixon", "nixon@rediffmail.com");
	Student stud04 = new Student("Kennedy", "Kennedy@rediffmail.com");
	
	TreeSet<Student> myStud = new TreeSet<Student>(new StudentComparator());
	
	myStud.add(stud01);
	myStud.add(stud02);
	myStud.add(stud03);
	myStud.add(stud04);
	
	for (Student student : myStud) {
	    System.out.println("Name: " + student.getName());
	    System.out.println("Email: " + student.getEmail());
	    System.out.println("##################");

	}


    }

}
