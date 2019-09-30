package com.Java8Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class streamsWithFilter {

    public static void main(String[] args) {
        List<String> list = Arrays.asList ( "Akhil", "Lakshmi Sesi priya", "Madhavi", "Venkatrao", "Ranga", "Kiran" );

       Set s= list.stream ().skip ( 2 ).collect ( Collectors.toSet () );
        System.out.println (s);

        //java8

        Set<String> set=list.stream ().filter ( i->!(i.equals ( "Kiran" )) ).collect ( Collectors.toSet () );
        System.out.println (set);

        //normal
        List<String> result = removeNameFromList ( list, "Kiran" );

        for ( String l :result) {
            System.out.println (l);
        }
    }

    public static List<String> removeNameFromList(List<String> list, String k) {
        List<String> l=new ArrayList<> (  );
        for (String result : list) {
            if (!(result.equals ( "Kiran" ))) {
                l.add (  result );
            }
        }
        return l;
    }


    //Java8

}
