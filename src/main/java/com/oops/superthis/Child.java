package com.oops.superthis;
public class Child extends Parent {
    public Child(){
       // this();super()
        super(10);
    }
   /* public Child(int i){
      super(i);

    }*/

    /**
     * This method should invoke default logic from parent and then its own logic
     */
    @Override
   public void m1(){
      super.m1();
      System.out.println("iam in child class m1()");
   }
}
