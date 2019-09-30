package com.Java8Practice;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class MapToList {
    public static void main(String[] args) {
        Map<Integer,String> map= new TreeMap<> (  );
        map.put(111, "Lalkrishna");
        map.put(154, "Atal");
        map.put(30, "Narendra");
        map.put(200, "Amit");

        Map<Integer, String>  map1=new TreeMap<> ( );

     List<User> list=  map.entrySet ().stream ().sorted(Comparator.comparing ( i->i.getValue () ) ).map ( i->new  User(i.getKey (),i.getValue () )).collect ( Collectors.toList () );
     list.forEach ( li-> System.out.println (li));
        System.out.println (list);
    }
}
