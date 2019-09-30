package com.sorting;

import com.forloop.model.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSorting {

    public static void main(String[] args) {

        List l = new ArrayList ();
        Employee e1 = new Employee ( 1, "=akhil", 22 );
        Employee e6 = new Employee ( 6, "somaiah", 27 );
        Employee e2 = new Employee ( 2, "sesi", 23 );
        Employee e4 = new Employee ( 4, "venkata rao", 25 );
        Employee e3 = new Employee ( 3, "madhavi", 24 );
        Employee e5 = new Employee ( 5, "mahalakshmi", 26 );

        l.add ( e1 );
        l.add ( e2 );
        l.add ( e6 );
        l.add ( e3 );
        l.add ( e5 );
        l.add ( e4 );

        Comparator<Employee> nameSorting = new Comparator<Employee> () {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName ().compareTo ( o2.getName () );
            }
        };

        Object l1=l.stream ().sorted ( nameSorting ).collect ( Collectors.toList () );
        System.out.println ( l1 );
    }


}
