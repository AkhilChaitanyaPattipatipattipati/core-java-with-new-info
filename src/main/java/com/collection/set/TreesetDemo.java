package com.collection.set;

import java.util.TreeSet;

public class TreesetDemo {
    public static void main(String[] args) {
        TreeSet t=new TreeSet();
        //only homogenious and comparable  objects can hold
        //duplicates not allowed
        //insertion order is not preserved it will insert based on sorting order
        //red black tree data structure
        /*t.add(5);
        t.add(1);
        t.add(3);
        t.add(4);
        t.add(6);
        t.add(8);
        t.add(7);
        t.add(2);
        t.add("ranga");*/
        t.add(new Employee(10,"ranga10"));
        t.add(new Employee(3,"ranga3"));
        t.add(new Employee(5,"ranga5"));
        t.add(new Employee(1,"ranga1"));
        System.out.println(t);
    }
}
