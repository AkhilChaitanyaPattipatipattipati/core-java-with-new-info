package com.collection.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListDemo {
    public static void main(String[] args) {
       /* ArrayList al=new ArrayList();
        al.add(11);
        al.add(11);
        al.add(null);
        al.add("krishna");*/

        List l=new ArrayList();//initial capacity 0 whne you instantiate the array list object
        l.add(11);//Default iniial capacity 10.
        l.add(null);
        l.add(11);
        l.add("ranga");
        System.out.println(l.contains("ranga"));
       // l.remove("ranga");
      //  m1(l);
      // l=new LinkedList();
       // l.removeAll(al);
       // l.retainAll(al);
        l.add(0,12);
        l.isEmpty();
        System.out.println( l.get(4));
      Object[] data=  l.toArray();
      for(Object obj:data){
          System.out.print(obj);
      }
       // m1(l);
    }
public static void m1(List al){
    System.out.println(al);
}
}
