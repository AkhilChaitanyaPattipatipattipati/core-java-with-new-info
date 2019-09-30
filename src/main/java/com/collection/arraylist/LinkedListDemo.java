package com.collection.arraylist;

import java.util.LinkedList;
import java.util.TreeSet;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList <Integer> ll=new LinkedList();
        ll.add(10);//10
        ll.addFirst(5);//5,10
        ll.addFirst(1);//1,5,10
        ll.addLast(15);//1,5,10,15
        ll.addLast(50);
        ll.removeFirst();//5,10,15
        ll.removeLast();//5,10
       // System.out.println( ll.getLast());
        // select operation is good if we are getting either first or last it means O(1)

        //ll.add("ranga");
        //O(n) for select ,O(1) add,remove or replace
       /* for (Integer i:ll)
        {
            System.out.println(i);
        }
        for(int i=0;i<ll.size();i++){
            System.out.println(ll.get(i));
        }*/

        int index=0;
        while(ll.get(index)!=15){
            System.out.println(ll.get(index));
            index++;
        }
       // System.out.println(ll);

    }
}
