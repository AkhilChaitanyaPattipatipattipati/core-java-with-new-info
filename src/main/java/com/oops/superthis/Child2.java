package com.oops.superthis;

public class Child2 extends Parent{
    private int k;
    public Child2(int k) {
        super(k);
        this.k=k;
    }
    public void m1(){
        super.m1();
        System.out.println("i am in child2 class m1() k="+k);
    }
}
