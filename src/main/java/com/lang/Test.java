package com.lang;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {

        Employee e1=new Employee(1,"ranga");
        Employee e2=new Employee(1,"ranga");
        System.out.println(e1==e2);
        System.out.println(e1.equals(e2));//Object equals e1==e2
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());

     //   Set s=new HashSet<>();//equals () return true  and hashcode()return same number then it consider duplicates
      //  s.add(e1);
     //   s.add(e2);
      //  System.out.println(s);
        //1.equals true hashcode same
        //2.hashcode different  equals false
        //3.equals false  then what about hashcode we cant conclude
        //4.hashcode same then what about equals we cant conclude

    }
}
