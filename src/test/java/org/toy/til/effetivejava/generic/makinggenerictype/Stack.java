package org.toy.til.effetivejava.generic.makinggenerictype;

import java.util.Arrays;

public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e){
        ensureCapacity();
        elements[size ++] = e;
    }



    private void ensureCapacity() {
        if(elements.length == size){
            elements = Arrays.copyOf(elements, 2* size + 1);
        }
    }
}
