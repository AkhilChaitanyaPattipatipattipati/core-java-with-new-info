package com.Java8Practice;

import com.forloop.model.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindanyOrElse {
    public static void main(String[] args) {

        List<Employee> emp = Arrays.asList ( new Employee ( 1, "Akhil", 999 ),
                                             new Employee ( 1, "Akhil", 999999 ),
                                             new Employee ( 2, "Madhavi", 999999999 ),
                                             new Employee ( 3, "Venkat", 999999999 ) );


       Employee e= emp.stream ().filter ( i->i.getName ().contains ( "Ma" ) ).findAny ().orElseThrow ( null );
        System.out.println (e);

       Set s= emp.stream ().map ( i->i.getName () ).collect ( Collectors.toSet () );
        System.out.println (s);

        Set s1=emp.stream ().map ( i->i.getName ().toUpperCase () ).collect ( Collectors.toSet () );
        System.out.println (s1);
    }
}
