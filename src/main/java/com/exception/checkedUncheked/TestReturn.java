package com.exception.checkedUncheked;

import java.io.FileNotFoundException;

public class TestReturn {
    public static void main(String[] args) {
        TestReturn t=new TestReturn();
        System.out.println(m1());
        m2();
    }
    public static int m1(){
        try{
            System.out.println("iam in try");
           // System.out.println(10/0);
            throw new RuntimeException("fileNotFound");
           // return 1;

        }
        catch(RuntimeException e){
                throw e;
        }catch(Exception e){
            System.out.println("iam in catch");

            throw e;
           // return 2;
        }

        finally{
            System.out.println("iam in finally");
          //  return 3;
        }
    }
    public static void m2(){
        try{
            System.out.println("iam in try");
        }/*catch(Exception e){

            System.out.println("iam in catch");
        }*/finally{
            System.out.println("iam in finally");
        }

    }
}
