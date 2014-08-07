package com.java.generics.stack;

public class StackDemoApp {

    public static void main(String[] args) {

    }
    // Stack Implementation
    class Stack<T> {
	
	// int[] Stack = new Stack[5];
	T[] stack = (T[]) new Object[5];
	private int ptr = -1;
	
	void push(T data) {
	    ptr++;
	    stack[ptr] = data;
	}
	
	T pop() {
	    return (T) stack[ptr--];
	    
	}
	
    }

}
