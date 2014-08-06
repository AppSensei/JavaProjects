package com.java.comparator;

import java.util.Comparator;

public class CrayonSort implements Comparator<Crayon> {

    @Override
    public int compare(Crayon one, Crayon two) {

	return one.getColor().compareTo(two.getColor());
    }

}
