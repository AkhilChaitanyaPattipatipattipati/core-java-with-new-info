package com.oops.superthis;

public class OOPSDemo {
    int x;
    static int y;
    public static void main(String[] args) {
        int k=10;

        OOPSDemo a1 = new OOPSDemo();//
        System.out.println(a1.x);
        a1.x=20;
        a1.m1(a1);
       /* System.out.println("print value"+a.x);
        System.out.println(y);
       a.m1();
       m2();
       ListUtils .m2();*/
        OOPSDemo a2 = new OOPSDemo();
        a2.x=30;
        a2.m1(a1);;
       // we can call static methods by class name
        // we can call instance methodes by creating by objects only
    }
    public void m1(OOPSDemo a1){
        System.out.println(this.x);
        System.out.println(a1.x);//20
        m2();
        System.out.println(OOPSDemo.y);
        System.out.println("I am in method m1");
    }

    public static  void m2(){

        System.out.println("i am in methid m2");
    }


}