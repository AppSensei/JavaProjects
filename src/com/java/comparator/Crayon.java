package com.java.comparator;

public class Crayon {

    public String color;

    public Crayon() {

    }

    public Crayon(String color) {
	this.color = color;
    }

    public String getColor() {
	return color;
    }

    public void setColor(String color) {
	this.color = color;
    }

    @Override
    public String toString() {
	return "color: " + color;
    }

}
