package com.java.strings;

public class StringEODParser {

    private static String trade = "IBM,09/09/2009, 87, 100, 80, 95, 1567923";

    public static void main(String[] args) {

	// Retrieving a substring.
	System.out.println("Retrieving a substring.");

	String datefield = trade.substring(4, 14);
	System.out.println("[" + datefield + "]");
	System.out.println();

	// Locating a char sequence.
	System.out.println("Locating a char sequence.");

	if (trade.contains("09/09/2009")) {
	    System.out.println("The trade contains the date: [09/09/2009]");
	} else {
	    System.out.println("The date [09/09/2009] not found in the records.");
	}
	System.out.println();

	
	// Replacing a character.
	System.out.println("Replacing a character");

	String str = trade.replace(',', ':');
	System.out.println("The new replaced version of Trade String" + ":" +  str);
	System.out.println();

	
	// Splitting strings into its fields.
	System.out.println("Splitting strings into its fields");
	String[] fields = trade.split(",");
	
	for (String strFields: fields) {
	    System.out.println("\t" + strFields);
	}
	System.out.println();


    }

}
