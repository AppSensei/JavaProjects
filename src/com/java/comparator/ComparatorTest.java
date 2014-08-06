package com.java.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorTest {
    
    public static void main(String[] args) {

    Crayon one = new Crayon("Red");
    Crayon two = new Crayon("Blue");
    Crayon three = new Crayon("Orange");
    Crayon four = new Crayon("Apple");
    
    CrayonSort cSort = new CrayonSort();
    ArrayList<Crayon> cList = new ArrayList<Crayon>();
    
    cList.add(one);
    cList.add(two);
    cList.add(three);
    cList.add(four);
    
    Collections.sort(cList, cSort);
    
    
    System.out.println("\nSorted: " + cList);
    
    
    }
}
