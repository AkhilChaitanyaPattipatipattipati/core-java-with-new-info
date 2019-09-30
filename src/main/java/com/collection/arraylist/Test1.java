package com.collection.arraylist;

public class Test1 {
    int x=10;
    public static int y=20;
    public static void main(String[] args) {
        Test1 test2 = new Test1();
        test2.c1();
        c2();

    }

    public void c1(){
        System.out.println("I am method m1");
        System.out.println(x);
        System.out.println(Test1.y);
    }

    public static void c2(){
        System.out.println("I am in method m2");
        Test1 test1=new Test1();
        System.out.println(test1.x);
        System.out.println(y);
    }
}
