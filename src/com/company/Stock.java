package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Stock implements Iterable<String> {

    public void arrayListRealization(){
          ArrayList<String> productByArrayList = new ArrayList<>();
          productByArrayList.add("Fridge");
          productByArrayList.add("Microwave");
          productByArrayList.add("Phone");
          productByArrayList.add("Dishwasher");
          System.out.println("Products by ArrayList");
          for(String s : productByArrayList){
              System.out.println(s);
          }


    }

    public void linkedListRealization(){
        LinkedList<String> productsByLinkedList = new LinkedList<>();
        productsByLinkedList.add("Toster");
        productsByLinkedList.add("TV");
        productsByLinkedList.add("PC");
        productsByLinkedList.add("Washing machine");
        System.out.println("Products by LinkedList");
        for(String s : productsByLinkedList){
            System.out.println(s);
        }
    }


    public Iterator<String> iterator(){
          return new MyIterator();
    }

}