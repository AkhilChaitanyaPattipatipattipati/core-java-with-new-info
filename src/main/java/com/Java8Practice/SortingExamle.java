package com.Java8Practice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.*;
import java.util.stream.Collectors;

public class SortingExamle {
    public static void main(String[] args) throws JsonProcessingException {
       /* List<Student> list= Arrays.asList ( new Student(1,"Madhavi"),
                                            new Student ( 2,"Venkatrao" ),
                                            new Student ( 3,"Sesi" ),
                                            new Student ( 9,"Akhil" ));
     List<Student> l1=  list.stream ().sorted ( Comparator.comparing ( i->i.getName () )).collect ( Collectors.toList () );
     l1.forEach ( i-> System.out.println (i) );*/
        Object obj=    new Student(1,"Madhavi");


        String json=new ObjectMapper ().writeValueAsString ( obj );
        System.out.println (json);

        Map<String,Object> map=new LinkedHashMap<> (  );

        map.put ( "id",1 );
        map.put ( "name","Madhavi" );
        String json2=new ObjectMapper ().writeValueAsString ( map );
        System.out.println( json2 );

    }
}
