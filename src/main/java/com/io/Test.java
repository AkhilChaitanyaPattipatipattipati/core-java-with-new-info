package com.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    static  String address;
    public String name;
    public List<Integer> rollNumber;



    public Test(List<Integer> rollNumber) {
        this.rollNumber = rollNumber;
    }



    public Test(String name, List<Integer> rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void m1(){
        System.out.println (address);
        System.out.println (name);
    }

    Test t = new Test ( Arrays.asList (  ) );

    List<Integer> rollNumber1= Arrays.asList ( 12,13,14,15,16 );


    //non static method
    public void card(){

    }
    public static void details(){
        List<Integer> l= Arrays.asList ( 1,2,3,4,5,6,7,8,9 );
    }
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList ( 1,2,3,4,5,6,7,8,9 );

        System.out.println (l);

        /*for (int a: l) {
            System.out.println (a);
            if(a ==2){

            }
        }*/

       // predicate
        // function
        //consumer
    }





}
