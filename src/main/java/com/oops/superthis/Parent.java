package com.oops.superthis;

public class Parent {
   /* public Parent(){
        System.out.println("parent class default constructor");
    }*/
   private int k;
    public Parent(int k){
        this.k=k;
        System.out.println("parent class parameterized constructor k="+k);
    }
    public void m1(){
        System.out.println("k value="+k);
    }
}
