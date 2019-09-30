package com.Java8Practice;

import java.util.Arrays;
import java.util.List;

public class mapToIntExample {
    public static void main(String[] args) {
       List<Employee> emp= Arrays.asList ( new Employee ( 1, 24) ,
                                           new Employee ( 2,25 ),
                                           new Employee ( 3,40 ),
                                           new Employee ( 9,47));

      Integer l= emp.stream ().mapToInt ( i->i.getAge () ).sum ();
      System.out.println (l);
    }
}
