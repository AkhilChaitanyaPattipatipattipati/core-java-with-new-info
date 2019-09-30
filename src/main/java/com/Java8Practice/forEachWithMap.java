package com.Java8Practice;

import java.util.HashMap;
import java.util.Map;

public class forEachWithMap {


    public static void main(String[] args) {
        Map<String,Integer> map= new HashMap<> (  );
        map.put ( "A", 9 );
        map.put ("B",99);
        map.put ( "C", 999 );
        map.put ("D",9999);

        //normal
        for (Map.Entry<String,Integer> entry: map.entrySet ()) {
            System.out.println (entry);
        }

       // java8
        map.entrySet ().forEach ( i-> System.out.println (i) );
    }


}
