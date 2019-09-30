package com.oops.superthis;

public class Test {
    public static void main(String[] args) {
     /*  Parent p=new Parent(10);
        p.m1();*/
        Child c=new Child();
        c.m1();
        System.out.println("Break-----------------------------Break");
        Child2 c2=new Child2(20);
        c2.m1();
    }
}
