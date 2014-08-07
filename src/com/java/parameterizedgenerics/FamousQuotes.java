package com.java.parameterizedgenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class FamousQuotes {

    private static ArrayList listOfFamousQuotes;
    private static ArrayList<String> listOfFamousQuotesTypeChecked;

    public static void main(String[] args) {

	FamousQuotes fm = new FamousQuotes();

	System.out.println("Without Generics: ........");
	fm.buildList();
	fm.printList();
	System.out.println("............................");

	System.out.println("With Generics .............");
	fm.buildListCheckedList();
	fm.printlistCheckedList();
	System.out.println(".............................");

	System.out.println("Expurgate Version without Generics");
	System.out.println();
	String strAuthor = "Winston Churchill";
	System.out.println("Removing Quotes from " + strAuthor);
	fm.expurgate(listOfFamousQuotes, strAuthor);
	System.out.println("Aftermath of expurgate command: ");
	System.out.println(" -----------------------------------------");

	fm.printList();
	System.out.println(" -----------------------------------------");

	System.out.println("Expurgate Version with Generics");
	System.out.println("Removing Quotes from " + strAuthor);
	fm.expurgateCheckedType(listOfFamousQuotesTypeChecked, strAuthor);
	System.out.println("Aftermath of expurgate command: ");
	System.out.println(" -----------------------------------------");

	fm.printlistCheckedList();
    }

    public void buildList() {

	listOfFamousQuotes = new ArrayList();
	listOfFamousQuotes.add("Where there is love there is life - Mahatma Gandhi");
	listOfFamousQuotes.add("A joke is a very serious thing - Winston Churchill");
	listOfFamousQuotes.add("In the end, everything is a gag - Charlie Chaplin");
       // listOfFamousQuotes.add(100); // To generate a runtime error.

    }

    public void buildListCheckedList() {
	listOfFamousQuotesTypeChecked = new ArrayList<String>();
	listOfFamousQuotesTypeChecked.add("Where there is love there is life - Mahatma Gandhi");
	listOfFamousQuotesTypeChecked.add("A joke is a very serious thing - Winston Churchill");
	listOfFamousQuotesTypeChecked.add("In the end, everything is a gag. - Charlie Chaplin");
	// listOfFamousQuotesTypeChecked.add(100);

    }

    public void printList() {
	Iterator listIterator = listOfFamousQuotes.iterator();
	while (listIterator.hasNext()) {
	    String quotes = (String) listIterator.next();
	    System.out.println(quotes);
	}
    }

    public void printlistCheckedList() {
	Iterator<String> quoteIterator = listOfFamousQuotesTypeChecked.iterator();
	while (quoteIterator.hasNext()) {
	    String quotes = (String) quoteIterator.next();
	    System.out.println(quotes);
	}
    }

    public void expurgate(Collection c, String strAuthor) {
	for (Iterator i = c.iterator(); i.hasNext();) {

	    if (((String) i.next()).contains(strAuthor)) {
		i.remove();
	    }
	}

    }

    public void expurgateCheckedType(Collection<String> c, String strAuthor) {
	for (Iterator i = c.iterator(); i.hasNext();) {

	    if (((String) i.next()).contains(strAuthor)) {
		i.remove();
	    }
	}
    }

}
