package com.Java8Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class conertingListToList {
    public static void main(String[] args) {

        Person p1 = new Person ( 1, "Akhil", "student" );
        Person p2 = new Person ( 1, "sesi", "teacher" );
        Person p3 = new Person ( 1, "madhavi", "student" );
        Person p4 = new Person ( 1, "venkat", "student" );

        List<Person> list = Arrays.asList ( p1, p2, p3, p4 );

     List<Student> stu=   list.stream ().filter ( i->i.getPersonType ().equals ( "student" ) )
                              .map ( i-> new Student ( i.getId (),i.getName () ) )
                              .collect ( Collectors.toList () );
        stu.forEach ( li->System.out.println(li));
    }
}
