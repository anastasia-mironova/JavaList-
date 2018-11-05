package com.company;

import java.util.Iterator;

public class MyIterator implements Iterator<String> {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public String next() {
        return null;
    }
}